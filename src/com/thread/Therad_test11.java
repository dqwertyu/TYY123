package com.thread;
class SaleThread implements Runnable{
	private int tickets=10;
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true ) {
			if (tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
				
			}
		}
	}
	
}
public class Therad_test11 {
	public static void main(String[] args) {
		SaleThread saleThread=new SaleThread();
		new Thread(saleThread,"窗口 1").start();
		new Thread(saleThread,"窗口 2").start();
		new Thread(saleThread,"窗口 3").start();
		new Thread(saleThread,"窗口 4").start();
		}
}
