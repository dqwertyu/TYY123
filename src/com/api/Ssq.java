package com.api;
import java.util.Random;

import javax.sound.midi.Synthesizer;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖结果:");
		System.out.println("六个红球号码是:");
		Random r=new Random();
		int hq;
		for (int i=0; i<6;i++) {
			hq=r.nextInt(33)+1;
			System.out.println(hq+" ");
			Thread.sleep(1000);
		}
		System.out.println("/n一个蓝色号码是:");
			int lq=r.nextInt(16)+1;
			System.out.println(lq+" ");
			Thread.sleep(1000);
		
	}
}
