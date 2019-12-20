package jihe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EE7_1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("E:\\123.txt");
		int b=0;
		while((b=in.read()) !=-1){
			System.out.println(b);
			
		}
		in.close();

	}

}
