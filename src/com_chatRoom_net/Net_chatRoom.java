package com_chatRoom_net;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class Net_chatRoom {

	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入聊天服务当前启动端口号:");
		int serverPort=sc.nextInt();
		System.out.println("请输入聊天服务发送信息对象的目标端口号:");
		int targetPort=sc.nextInt();
		System.out.println("聊天系统初始化完成并启动!!!:");
		try {
			DatagramSocket socket=new DatagramSocket(serverPort);
			new Thread(new ChatReceiver(socket),"接收服务").start();
			new Thread(new ChatSend(socket,serverPort),"发送服务").start();
		} catch ( SocketException e) {
			
		}
		
	}
}


