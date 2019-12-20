package jihe;

import java.io.IOException;

public class FileWriter {
	public static void main(String[] args) throws Exception {
		FileWriter fileWriter=new FileWriter("E:\\writer.txt");
		fileWriter.write("轻轻的我走了,\r\n");
		fileWriter.write("正如我轻轻的来,\r\n");
		fileWriter.write("我轻轻的招手,\r\n");
		fileWriter.write("作别西边的云彩,\r\n");
		fileWriter .close();
	}
}
