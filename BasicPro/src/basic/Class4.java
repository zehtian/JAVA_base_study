package basic;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 方法的重载：参数名称一样 但类型不同 函数返回值类型不同 不能算重载
 * 
 * @author Administrator Class4类
 */
public class Class4 {

	int add(int a, int b) {
		System.out.println("方法一");
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("方法二");
		return a + b + c;
	}

	int add(int a, String b) {
		System.out.println("方法三");
		return a + Integer.parseInt(b);
	}

	public static void main(String args[]) {
		Class4 demo = new Class4();
		System.out.println(demo.add(1, 2));
		System.out.println(demo.add(1, 2, 3));
		System.out.println(demo.add(1, "2"));
        
	}
	

}
