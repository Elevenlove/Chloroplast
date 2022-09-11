package ChloroplastSE.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerNetwork {
   static ArrayList<String> Messages = new ArrayList<String>();
   @SuppressWarnings("resource")
public void ServerBase(){
	   Socket network = new Socket();
	   try {
	    InputStream inputStream = network.getInputStream();
	    //��ÿͻ���������
	    OutputStream OutputStream = network.getOutputStream();
	    byte[] bytes = new byte[1024];
	    int len;
	    StringBuilder sb = new StringBuilder();
	    while ((len = inputStream.read(bytes)) != -1) {
	      //ע��ָ�������ʽ�����ͷ��ͽ��շ�һ��Ҫͳһ������ʹ��UTF-8
	      sb.append(new String(bytes, 0, len,"UTF-8"));
	    }
	    
	    inputStream.close();
	    OutputStream.close();
	    network.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
