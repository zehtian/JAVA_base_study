package basic;

/**
 * this�ؼ���
 * @author Administrator
 *
 */
public class Comp2 {
	
	private String name;
	private int age;
	
	/**
	 * Ĭ�Ϲ��췽�� 
	 * ����û�й��췽������ϵͳ���Զ�����һ��Ĭ�ϵĹ��췽����������Ϊ���������й��췽����ϵͳ�����Զ����ɷ���
	 */
	Comp2(){
		System.out.println("Ĭ�Ϲ��췽��");	
	}
	
	/**
	 * �в����Ĺ��췽�� ���췽��������
	 */
	Comp2(String name,int age){
		//this������Ĭ�ϵĹ��췽��
		this();
		this.name=name;
		this.age=age;
		System.out.println("�в����Ĺ��췽��");		
	}
	
	public void say() {
		System.out.println("�ҽ�"+name+",�ҽ���"+age+"����");
	}

	public static void main(String[] args) {
		//Comp1 comp=new Comp1();
		Comp2 comp2=new Comp2("����",23);
		comp2.say();
		
	}
}
