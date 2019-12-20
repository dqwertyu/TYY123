package com.tostring;

class Animal  {
	String name="动物";
	void shout() {
		System.out.println("动物");
	}
	//重写父类Object中的toString方法
	@Override
	public String toString() {
		return "这是一只动物";
	}
}
class Dog extends Animal {
	@Override
	public String toString() {
		return "这是一只小狗";
	}
}

//定义一个测试类
public class E06{
	public static void main(String[] args) {
		Animal dw=new Animal();
		System.out.println(dw.toString());
		Dog XT=new Dog();
		System.out.println(XT.toString());
	}
}
