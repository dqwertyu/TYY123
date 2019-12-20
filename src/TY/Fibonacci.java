package TY;

public class Fibonacci {
		public static int F(int n) {
			if(n==1) return 1;
			if(n==2) return 2;
			
			return F(n-1)+F(n-2);
		}
		public static void main(String[]args) {
			System.out.println("Fibonacci�ĵ�50������"+F(50));
		}
}
