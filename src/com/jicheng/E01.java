package com.jicheng;

	//定义动物类
	class Animal{
		String name;
		public Animal() {
			System.out.println("我是一只动物 ");
		}
		void shout() {
			System.out.println("动物发出的叫声");
		}
	}
	//定义dog类型继承Animal类
	
	class Dog extends Animal{
		public Dog() {
			super();
			
		}
		public Dog(String name) {
			super();
		}
		
		//继承了Animal类所有可以的方法和成员 变量
		void printName() {
			System.out.println("name="+name);
		}
		@Override//重写前面@Override是注解
		void shout() {
			//super用来指代父亲
			super.shout();
			System.out.println("汪汪....");
		}
	}
	public class E01 {
	public static void main(String[]args) {
		Dog dog=new Dog();
		dog.name="土狗子";
		dog.printName();
		dog.shout();
	}
}