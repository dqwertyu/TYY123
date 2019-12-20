package com.Collection集合遍历;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Properties;

public class Properties_test {
		public static void main(String[] args) throws FileNotFoundException,IOException{
		Properties sjx=new Properties();
		sjx.load(new FileInputStream("E:\\css"));
		sjx.forEach((key,value)->System.out.println(key+":"+value));
		}
}
