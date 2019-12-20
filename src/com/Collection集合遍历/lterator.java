package com.Collection集合遍历;

import java.util.ArrayList;
import java.util.Iterator;

public class lterator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
		Object obj=iterator.next();
		System.out.println(obj);
	}
			
}
}
