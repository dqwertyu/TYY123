package jihe;

public class FileReader {

	public static void main(String[] args) throws Exception{
		FileReader fileReader=new FileReader("E\\:reader.txt");
		int len=0;
		while ((len=fileReader.read)!=-1);{
		System.out.println((char)len);
	}
		fileReader.close();
	}	
}
