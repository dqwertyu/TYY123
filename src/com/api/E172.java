package com.api;

import java.util.Random;

public class E172 {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("生成boolean类型的随机数:"+r.nextBoolean());
		System.out.println("生成double类型的随机数:"+r.nextDouble());
		System.out.println("生成float类型的随机数:"+r.nextFloat());
		System.out.println("生成Int类型的随机数:"+r.nextInt());
		System.out.println("生成0到10之间int类型的随机数:"+r.nextInt(10));
		System.out.println("生成long类型的随机数:"+r.nextLong());
	}
}
