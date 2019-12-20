package com.interface_;

import java.io.ObjectInputStream.GetField;

import com.interface_.Animal.LandAnimal;

//接口编译class 文件

interface Animal{
	//接口中没有成员变量
	//只有public final的成员变量
	//public static final 三个关键字可以省略
	
	public static final int ID=1;
	//abstract抽象
	//接口中的方法都 public abstract
	//public abstract 两个关键字可以省略
	
interface LandAnimal extends Animal{
	void run();

}

	//接口里可以有静态非抽象方法
	static int getID() {
	return Animal.ID;
}
	

public abstract void shout();

}
	  class Dog implements LandAnimal{
		//必须重写父类中的抽象方法
		@Override
		public void shout() {
			System.out.println("汪汪..........");
		}
		
		@Override
		public void run() {
			System.out.println("我乃西厂雨化谭，名冲");
		}
		
	}


public class E13 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		System.out.println(Animal.getID());
	}
}
