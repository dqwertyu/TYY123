package com.string;

public class E01字符串 {
	public static void main(String[] args) {
		//创建一个空的字符串
		String str1=new String();
		//创建一个abc的字符串
		String str2=new String("abc");
		//创建一个为数组的字符串
		char[]charArray=new char[] {'A','B','C',};
		String str3=new String(charArray);
		String str4=new String(charArray);
		System.out.println("a"+str1+"b");
		//输出的结果
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
