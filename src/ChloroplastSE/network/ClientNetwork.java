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
    // 要连接的服务端IP地址和端口
	
    System.out.println("输入一个主机IP。这个IP必须是可连接的有效IP。");
	Scanner ScanIP = new Scanner(System.in);
	String host = ScanIP.nextLine();
	System.out.println("输入该IP的端口。这个端口必须是未被占用的有效整型值。");
	@SuppressWarnings("resource")
	Scanner ScanPort = new Scanner(System.in);
    int port = ScanPort.nextInt();
    // 与服务端建立连接
    Socket socket = new Socket(host,port);
    // 建立连接后获得输出流
    System.out.println("输入操作代码" + "\n" + "1----发送一条消息\n"+"2----远程执行一份Choroplast文件\n"+"3----显示目标的Chloroplast信息");
    Scanner ScanOprating = new Scanner(System.in);
    if (ScanOprating.nextInt() == 1){
    	    OutputStream outputStream = socket.getOutputStream();
    String message = "Send";
    socket.getOutputStream().write(message.getBytes("UTF-8"));
    //通过shutdownOutput高速服务器已经发送完数据，后续只能接受数据
    socket.shutdownOutput();
    
    InputStream inputStream = socket.getInputStream();
    byte[] bytes = new byte[1024];
    int len;
    StringBuilder sb = new StringBuilder();
    while ((len = inputStream.read(bytes)) != -1) {
      //注意指定编码格式，发送方和接收方一定要统一，建议使用UTF-8
      sb.append(new String(bytes, 0, len,"UTF-8"));
    }
    System.out.println("get message from server: " + sb);
    
    inputStream.close();
    outputStream.close();
    socket.close();
    }
    if (ScanOprating.nextInt() == 3){
    	System.out.println("输入对方路径和文件名.");
    	Scanner ScanFilePath = new Scanner(System.in);
    	String FilesPathA = ScanFilePath.nextLine();
    	ArrayList<String> FilesList = new ArrayList<String>();
    	BufferedReader BF = new BufferedReader(new FileReader(FilesPathA));
    }

  }
}