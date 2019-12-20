package TY;

import java.io.Console;
import java.lang.invoke.ConstantCallSite;

public class T4 {
	public static void main(String[] args) {
		
		System.out.println("二进制以0b�?�?"+0b11000110);
		System.out.println("八进制以0�?�?"+0306);
		System.out.println("十六进制�?0x�?�?"+0x16);
		//浮点数后面的f表示它是�?个单精度浮点�?
		System.out.println("5.022f="+5.022f);
		//浮点数后面的d表示它是�?个双精度浮点�?,这个d可以不写 
		System.out.println("5.022e+8="+5.022f+8);
		System.out.println("5.022f+8d="+5.022f+8d);
		
		System.out.print("我的名字�?"+'\u8c2d'+'\u51b2');
		
		System.out.println("Welcome,\nMonitor");
		System.out.println("布尔常量"+true+"�?"+false);
		System.out.println("引用数据类型常量"+null);
		
		int a=5;
		
		Constant constant=new Constant();
		constant=null;
		//如果在类型的前面加上final关键字作为修饰符，那么修饰符的变量就成为常量
		//它不是字面意义的常量
		final int B=6;
	}
}
