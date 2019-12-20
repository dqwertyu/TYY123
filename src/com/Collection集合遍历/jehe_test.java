package com.Collection集合遍历;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class jehe_test {
	public static void main(String[] args) {
		Map map=new TreeMap(new CustomComparator());
		map.put("1", "Lucy");
		map.put("2", "John");
		map.put("3", "Smith");
		map.put("4", "Aimee");
		map.put("5", "Amanda");
		System.out.println(map);
		Set entrySet=map.entrySet();
		Iterator it=entrySet.iterator();
		while(it.hasNext()){
			Map.Entry entry=(Map.Entry)(it.next());
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+":"+value);
	}
}
}