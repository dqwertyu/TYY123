package com.school;

public class Student {
	//定义两个成员的变�?
		String name;
		int score;
		//如果没有定义的任何构造方�?:java虚拟机会自动创建�?个无参的构�?�方�?
		//定义无参的构造方�?:
		//构�?�方法是�?种特殊的方法:修饰�?+类名([参数类型 参数名]){}
		public Student(){}
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
		//2对个体特�? setter方法
		public String getName() {
			return name;
		}
		public void setName(String string) {
			this.name = string;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
}