package file;

import java.io.*;

/**
 * �ֽ�����/���������
 * �ַ�����/���������
 * @author tzh666
 *
 */
public class FileStreamTest {
	public static void main(String[] args) {
		File file = new File("1.txt");
		//��
		try {
			/***�ֽ�***/
/*			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "�����666".getBytes();
			out.write(buy);
			out.close();*/
			/***�ַ�***/
			FileWriter out = new FileWriter(file);
			String buy = "tzh666";
			out.write(buy);
			out.close();
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//д
		try {
			/***�ֽ�***/
			/*FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println("�ļ���Ϊ��"+ new String(byt,0,len));
		    in.close();*/
			/***�ַ�***/
			FileReader in = new FileReader(file);
			char byt[] = new char[1024];
			in.read(byt);
			System.out.println("�ļ���Ϊ��"+ new String(byt));
			in.close();
		
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
