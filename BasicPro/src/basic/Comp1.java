package basic;

public class Comp1 {
	
	private String name;
	private int age;
	
	/**
	 * Ĭ�Ϲ��췽�� 
	 * ����û�й��췽������ϵͳ���Զ�����һ��Ĭ�ϵĹ��췽����������Ϊ���������й��췽����ϵͳ�����Զ����ɷ���
	 */
	/*Comp1(){
		System.out.println("Ĭ�Ϲ��췽��");
	
	}*/
	
	/**
	 * �в����Ĺ��췽�� ���췽��������
	 */
	Comp1(String name2,int age2){
		name=name2;
		age=age2;
		System.out.println("�в����Ĺ��췽��");
		
	}
	
	public void say() {
		System.out.println("�ҽ�"+name+",�ҽ���"+age+"����");
	}

	public static void main(String[] args) {
		//Comp1 comp=new Comp1();
		Comp1 comp2=new Comp1("����",23);
		comp2.say();
		
	}
}
