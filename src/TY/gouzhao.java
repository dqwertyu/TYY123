package TY;

public class gouzhao {
	//构造方法重载
	public gouzhao() {
		System.out.println("构造方法一被调用了");
	}
	public gouzhao(int x) {
		//this关键字指代类本身
		this();
		System.out.println("构造方法二被调用了");
	}
	public gouzhao(boolean b) {
		//this键字指代类本身
		this(1);
		System.out.println("构造方法二被调用了");
	}
	public static void main(String[]args) {
		gouzhao test=new gouzhao(true);
	}
}
