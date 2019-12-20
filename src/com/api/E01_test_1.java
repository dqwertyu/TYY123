package com.api;

import java.util.ArrayList;
import java.util.LinkedList;

public class E01_test_1 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度:"+list.size());
		System.out.println("第二个元素是:"+list.get(1));
		
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("s1");
		list2.add("s2");
		System.out.println(list2);
		System.out.println("第一个元素是"+list2.get(0));
		System.out.println("第一个元素 是"+list2.peek());
		list2.removeFirst();
		list2.pollLast();
		System.out.println(list2);
	}

}
