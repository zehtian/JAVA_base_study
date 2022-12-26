package basic;

/**
 * Static静态方法与普通方法
 * @author Administrator
 *
 */
public class Class5 {
	
	void fun1() {
		System.out.println("这是一个普通方法");
	}

    static void fun2() {
		System.out.println("这是一个静态方法");
	}

    public static void main(String[] args) {
    	Class5 demo=new Class5();
    	//调用普通方法 对象.方法
    	demo.fun1();
    	
    	//调用静态方法 类名.方法
    	Class5.fun2();
    }

}
