package basic;

/**
 * Static��̬��������ͨ����
 * @author Administrator
 *
 */
public class Class5 {
	
	void fun1() {
		System.out.println("����һ����ͨ����");
	}

    static void fun2() {
		System.out.println("����һ����̬����");
	}

    public static void main(String[] args) {
    	Class5 demo=new Class5();
    	//������ͨ���� ����.����
    	demo.fun1();
    	
    	//���þ�̬���� ����.����
    	Class5.fun2();
    }

}
