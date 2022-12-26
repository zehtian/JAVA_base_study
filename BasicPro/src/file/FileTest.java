package file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("C:/1.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已删除");
		} 
		else
			try {
				file.createNewFile();
				System.out.println("文件已创建");			
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}	
	}
}
