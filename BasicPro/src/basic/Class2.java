package basic;

/**
 * Class2�� 
 * @author Administrator
 * �� ���� 
 */

public class Class2 {
	
	//�βΣ����     ��ĳһ�����������̶�������...
	//������ֵ
	int speak(String name,int age,String ...hobbies) {
		System.out.println("�ҽ�"+name+",�ҽ���"+age+"����");
        System.out.print("�ҵİ��ã�");
        for(String hobby:hobbies) {
        	System.out.print(hobby+" ");
        }
        
        //��ȡ���õĳ���
        int totalhobbies=hobbies.length;
        return totalhobbies;
	}
	
	public static void main(String[] args) {
		Class2 zhangsan=new Class2();
		int n=zhangsan.speak("����",23,"��","��","rap","����");
        System.out.println("\n��"+n+"������");	
 	}

}
