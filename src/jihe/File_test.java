package jihe;

import java.io.File;
import java.io.FileDescriptor;

public class File_test {

	public static void main(String[] args) {
		File file=new File("E:\\Java\\TYY123\\src\\jihe");
		fileDir(file);

	}
	public static void fileDir(File file) {
		File[] listFiles=file.listFiles();
		for(File files:listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
}
}
