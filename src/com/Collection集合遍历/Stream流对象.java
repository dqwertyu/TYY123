package com.Collection集合遍历;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream流对象 {
    public static void main(String[] args) {
		Integer [] array= {9,8,3,5,2};
		List<Integer>list =Arrays.asList(array);
		Stream<Integer>stream=list.stream();
		stream.forEach(i->System.out.print(i+" "));
		System.out.println();
		Stream<Integer>stream3=Arrays.stream(array);
		stream3.forEach(i->System.out.print(i+" "));
	}
}
