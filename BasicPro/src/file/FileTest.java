package file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("C:/1.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ���ɾ��");
		} 
		else
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѵ���");			
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}	
	}
}
