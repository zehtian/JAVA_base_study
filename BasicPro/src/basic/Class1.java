package basic;

/**
 * Class1��
 * @author Administrator
 * ��
 */

public class Class1 {
	String name;           //�����У�����һ������name�ַ���
    int age;            //�����У�����һ������age����
    
    public String speak() {
        return "�ҽ�"+name+"�ҽ���"+age+"����";
    }
    
    public static void main(String[] args) {
    	//����һ��Class1��Ķ���zhangsan
    	Class1 zhangsan;
    	//ʵ����
    	zhangsan=new Class1();
    	zhangsan.name="����";
    	zhangsan.age=23;
    	System.out.println(zhangsan.speak());
    }
}
