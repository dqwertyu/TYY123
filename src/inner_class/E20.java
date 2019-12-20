package inner_class;
interface Animal{
	void shout();
}
public class E20 {
	public static void main(String[] args) {
		String name="花猫";
		//Cat cat=new Cat();
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("喵喵");
			}
		});
		animalShout(()->System.out.println(name+"喵喵"));
	}
	private static void animalShout(Animal an) {
		an.shout();
	}
}
