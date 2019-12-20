package TY;

import java.io.Serializable;
public class Lei {
	//定义三个内部�?
	//修饰�?+class+类名标识�?+extends(继承关键�?) 父类标识�?+implements(实现关键�?) 父接�?
	//第一类修饰符表示作用范围:public公有�?  proteted受保护的	private私有�?
	//第二类修饰符表示特定功能:static静�?�的  final�?终的(该类没有子类)synchronuzed同步�?
	public static final class A	extends Object implements Serializable{}
	private static final class B extends Object implements Serializable{}
			static final class C extends Object implements Serializable{}
	protected static final class D extends Object implements Serializable{}
	/*private final static class abc{}
	final static class def{}
	protected final static class bcd{}
	public final static class cdf{}*/
	//定义两个成员变量:修饰�?+变量�?属的数据类型+变量标识�?
	private static  int age=0;
	private static final String name="";
	//定义两个成员的方�?:修饰�?+方法返回的�?�的数据类型+方法�?(参数值的类型  参数�?){}
	//方法名前面先有修饰符(可省�?),方法名前面后有返回�?�类�?(不可省略)
	//返回值类型为void表示�?,方法体内部需要return语句
	//其他类型的返回�??,方法体内都需要return语句
	//方法名后面先跟一对小括号,再跟�?对大括号
	//方法名后面的�?对小括号里可以包含参�?,格式�?:参数类型 参数�?
	void setAge(int nianling) {
		age=nianling;
	}
	public int getAge() {
		return age;
	}
}
