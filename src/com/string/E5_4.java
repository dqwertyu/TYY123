package com.string;

import java.io.CharArrayReader;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class E5_4 {

	private static Object CharArrayReader;

	public static void main(String[] args) {
		String s="   http://localhost : 8080    ";
		System.out.println(s);//去掉两端字符空格;
		System.out.println("去除字符串两端空格后的结果:"+s.trim());
		System.out.println("去除字符串中所有空格后的结果:"+s.replace(" ",""));
		System.out.println("去除字符串中所有空格后的结果:"+s.replaceAll("\\s+",""));
		
	}
	
}