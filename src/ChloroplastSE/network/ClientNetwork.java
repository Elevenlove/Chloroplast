package ChloroplastSE.network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.Socket;
import java.util.*;

public class ClientNetwork {
  static ArrayList<String> Messages = new ArrayList<String>();
  public void ClientBase() throws Exception {
    // Ҫ���ӵķ����IP��ַ�Ͷ˿�
	
    System.out.println("����һ������IP�����IP�����ǿ����ӵ���ЧIP��");
	Scanner ScanIP = new Scanner(System.in);
	String host = ScanIP.nextLine();
	System.out.println("�����IP�Ķ˿ڡ�����˿ڱ�����δ��ռ�õ���Ч����ֵ��");
	@SuppressWarnings("resource")
	Scanner ScanPort = new Scanner(System.in);
    int port = ScanPort.nextInt();
    // �����˽�������
    Socket socket = new Socket(host,port);
    // �������Ӻ��������
    System.out.println("�����������" + "\n" + "1----����һ����Ϣ\n"+"2----Զ��ִ��һ��Choroplast�ļ�\n"+"3----��ʾĿ���Chloroplast��Ϣ");
    Scanner ScanOprating = new Scanner(System.in);
    if (ScanOprating.nextInt() == 1){
    	    OutputStream outputStream = socket.getOutputStream();
    String message = "Send";
    socket.getOutputStream().write(message.getBytes("UTF-8"));
    //ͨ��shutdownOutput���ٷ������Ѿ����������ݣ�����ֻ�ܽ�������
    socket.shutdownOutput();
    
    InputStream inputStream = socket.getInputStream();
    byte[] bytes = new byte[1024];
    int len;
    StringBuilder sb = new StringBuilder();
    while ((len = inputStream.read(bytes)) != -1) {
      //ע��ָ�������ʽ�����ͷ��ͽ��շ�һ��Ҫͳһ������ʹ��UTF-8
      sb.append(new String(bytes, 0, len,"UTF-8"));
    }
    System.out.println("get message from server: " + sb);
    
    inputStream.close();
    outputStream.close();
    socket.close();
    }
    if (ScanOprating.nextInt() == 3){
    	System.out.println("����Է�·�����ļ���.");
    	Scanner ScanFilePath = new Scanner(System.in);
    	String FilesPathA = ScanFilePath.nextLine();
    	ArrayList<String> FilesList = new ArrayList<String>();
    	BufferedReader BF = new BufferedReader(new FileReader(FilesPathA));
    }

  }
}