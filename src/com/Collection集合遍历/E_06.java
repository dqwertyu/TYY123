package com.Collection集合遍历;

import java.util.ArrayList;
import java.util.Iterator;

public class E_06 {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		list.add("jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Object obj =it.next();
			if ("Annie".equals(obj)) {
				
			}
		}
		System.out.println(list);
	}

}
