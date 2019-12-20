package com.Collection集合遍历;

import java.util.HashSet;

class Person{
	String name;
	int age;
	public Person(String name,int age){
		super();
		this.name=name;
		this.age=age;
}
	public String toString() {
		return age+":"+name;
	}
	public int hashCode() {
		return name.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student stu=(Student) obj;
		boolean b=this.name.equals(stu.id);
		return b;
	}
	
	
}
public class P_243_01{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Student stu1=new Student("1","Jack");
		Student stu2=new Student("2","Rose");
		Student stu3=new Student("3","Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}
