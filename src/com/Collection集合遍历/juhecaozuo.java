package com.Collection集合遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;import javax.swing.plaf.synth.SynthScrollBarUI;

public class juhecaozuo {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("湖人");
		list.add("湖泊");
		list.add("勇士士");
		list.add("火箭");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("湖"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=======");
		
		list.stream().filter(i->i.startsWith("湖")).limit(2)
		.forEach(i->System.out.println(i));
	
	}
		
	
}
