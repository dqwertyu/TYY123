package com.Collection集合遍历;

import java.util.HashSet;

public class E_09 {

	public static void main(String[] args) {
		HashSet set =new HashSet<>();
		set.add("jack");
		set.add("Tom");
		set.add("Eve");
		set.add("Rose");
		set.forEach(o->System.out.println(o));

	}

}
