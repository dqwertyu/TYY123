package com.Collection集合遍历;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class E622 {

	public static void main(String[] args)throws Exception{
		Properties pps=new Properties();
		pps.load(new FileInputStream("E:\\Java\\TYY123\\src\\com\\Collection集合遍历\\test.properties"));
		pps.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out=new FileOutputStream("E:\\Java\\TYY123\\src\\com\\Collection集合遍历\\test.properties");
		pps.setProperty("charset", "UTF-8");
		pps.store(out,"新增charset编码");
		

	}

}
