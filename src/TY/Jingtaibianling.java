package TY;
class Student{
	static String SchoolName;
}
public class Jingtaibianling{
	public static void main(String[]args) {
		Student s1=new Student();
		Student s2=new Student();
	
	//静态变量可以直接用类名直接引用
	//如果没有static着色安，只有用该类的实例 也就是对象来引用 
	Student.SchoolName="汉江艺术职业学院";
	
	System.out.println("我是"+s1 SchoolName+"的学生");
	System.out.println("我是"+s2 SchoolName+"的学生");
}
}

