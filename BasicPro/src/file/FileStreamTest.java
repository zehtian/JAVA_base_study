package file;

import java.io.*;

/**
 * 字节输入/输出流操作
 * 字符输入/输出流操作
 * @author tzh666
 *
 */
public class FileStreamTest {
	public static void main(String[] args) {
		File file = new File("1.txt");
		//读
		try {
			/***字节***/
/*			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "田泽豪666".getBytes();
			out.write(buy);
			out.close();*/
			/***字符***/
			FileWriter out = new FileWriter(file);
			String buy = "tzh666";
			out.write(buy);
			out.close();
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//写
		try {
			/***字节***/
			/*FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println("文件中为："+ new String(byt,0,len));
		    in.close();*/
			/***字符***/
			FileReader in = new FileReader(file);
			char byt[] = new char[1024];
			in.read(byt);
			System.out.println("文件中为："+ new String(byt));
			in.close();
		
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
