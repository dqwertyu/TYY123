package TY;

public class Exampule06 {
		public static int add(int x ,int y) {
			return x+y;
		}
		//ʵ�����������
		public static int add(int x ,int y, int z) {
			return x+y+z;
		}//��ʵ���������
		public static double add(double x,double y) {
			return x+y;
		}//ʵ��С�����
		public static void main (String[]args) {
			//�����ͷ���������
			int sum1= add(1,2);
			int sum2= add(3,8,9);
			double sum3= add(0.3,6.3);
			//��������
			System.out.println("sum1"+sum1);
			System.out.println("sum2"+sum2);
			System.out.println("sum3"+sum3);
		}

		
}
