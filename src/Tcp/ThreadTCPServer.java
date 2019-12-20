package Tcp;


import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadTCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz=new ServerSocket(8899);
		while(true) {
			Socket client=fwqtjz.accept();
			Thread thread=new Thread(()->{
				try {
		//要往客户端发送数据，必须通过所获得的客户端套接字创建输出流
			int port=client.getPort();
			System.out.println("与端口号为"+port+"客户端连接成功");
			OutputStream os=client.getOutputStream();
			String s="你好,来自10.2.103.31这个tcp服务器的问候";
			byte[] b=s.getBytes();
			os.write(b);
			os.close();
			client.close();
		}catch(Exception e) {
			e.printStackTrace();
			}
		});
			thread.start();
	}
}
}
