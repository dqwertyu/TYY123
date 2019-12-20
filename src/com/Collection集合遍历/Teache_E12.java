package com.Collection集合遍历;
import java.util.TreeSet;
class Teacher implements Comparable{
	String name;
	int age;
	public Teacher (String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
	public int compareTo(Object obj) {
		Teacher s=(Teacher) obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}
public class Teache_E12 {
	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("谢耀锋",120));
		ts.add(new Teacher("张晓珣",17));
		ts.add(new Teacher("王荟",18));
		ts.add(new Teacher("谭冲",18));
		System.out.println(ts);
	}
}
