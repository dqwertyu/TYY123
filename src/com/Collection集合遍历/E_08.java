package com.Collection集合遍历;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E_08 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		Iterator it=list.iterator();
		it.forEachRemaining(Obj->System.out.println("迭代集合元素:"+Obj));

	}

}