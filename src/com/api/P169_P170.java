package com.api;

import java.io.IOException;

public class P169_P170 {

	public static void main(String[] args) throws Exception {
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数:"+rt.availableProcessors()+"个");	
		System.out.println("空间内在大小:"+rt.freeMemory()/1024/1024+"M");		
		System.out.println(rt.maxMemory()/1024/1024+"M");
	
		//调用系统命令
		Process jingcheng=rt.exec("notepad.exe");
		Thread.sleep(3000);
		jingcheng.destroy();
	}
}
