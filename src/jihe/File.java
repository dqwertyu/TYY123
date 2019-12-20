package jihe;

import java.io.File;
import java.util.Arrays;

public class File {
	public static void main(String[] args) {
		File file =new File("E:\\Java\\TYY123");
		if(file.isDirectory()) {
			String[]fileNames=file.list((dir,name)->name.endsWith(".txt"));
			Arrays.stream(fileNames).
			forEach(e->System.out.println(e));
		}
	}
}
