package basic;

import org.omg.Messaging.SyncScopeHelper;

/**
 * ���������أ���������һ�� �����Ͳ�ͬ ��������ֵ���Ͳ�ͬ ����������
 * 
 * @author Administrator Class4��
 */
public class Class4 {

	int add(int a, int b) {
		System.out.println("����һ");
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("������");
		return a + b + c;
	}

	int add(int a, String b) {
		System.out.println("������");
		return a + Integer.parseInt(b);
	}

	public static void main(String args[]) {
		Class4 demo = new Class4();
		System.out.println(demo.add(1, 2));
		System.out.println(demo.add(1, 2, 3));
		System.out.println(demo.add(1, "2"));
        
	}
	

}
