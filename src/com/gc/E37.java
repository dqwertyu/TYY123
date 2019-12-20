package com.gc;
class Person{
	public void finalize() {
		System.out.println("对象作业垃圾被回收......");
	}
}
public class E37 {
	public static void recyckegWaste1() {
		Person p1=new Person();
		p1=null;
		int i=1;
		while (i<10) {
			System.out.println("方法1循环中.....");
			i++;
		}
		
	}
	public static void recyckegWaste2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		int i=1;
		while (i<10) {
			System.out.println("方法2循环中.....");
			i++;
		}
		
	}
	public static void main(String[] args) {
		recyckegWaste1();
		System.out.println("===================");
		recyckegWaste2();
	}
}
