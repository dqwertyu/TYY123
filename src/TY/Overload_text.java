package TY;

public class Overload_text {
  public static void man(String[]args) {
	  //如果一个方法是静态方法，可以直接用类名来引用
  System.out.println(Exampule06.add(3,5));
  System.out.println(Exampule06.add(3,9,7));
  
  //不管方法是不是静态的，都可以用对象名来引用
  Exampule06 o1=new Exampule06();
  System.out.println(o1.add(3.1,5.2));
  }
}
