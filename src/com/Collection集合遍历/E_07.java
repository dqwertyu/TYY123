package com.Collection集合遍历;

import java.util.ArrayList;
import java.util.List;

public class E_07 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		list.forEach(obj->System.out.println("迭代集合元素:"+obj));
		
		

	}

}
