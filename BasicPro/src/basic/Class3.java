package basic;

/**
 * Class3��
 * @author Administrator
 * ������ֵ���ݺ����ô���
 */

class Sanwei{
	int b;//��Χ
	int w;//��Χ
	int h;//��Χ
}

public class Class3{
	
    //��Ϊage��ֵ���ݣ���˻���23��
	//��sanwei�����ô��ݣ���˻�ı�
	void speak(int age,Sanwei sanwei) {
		System.out.println("�ҽ���"+age+"����,�ҵ���Χ�ǣ�"+sanwei.b+","+sanwei.w+","+sanwei.h);
		age=24;
		sanwei.b=80;
	}
	
	public static void main(String[] args) {
		Class3 Xiaoli=new Class3();
		int age=23;
		Sanwei sanwei=new Sanwei();
		sanwei.b=90;
		sanwei.w=60;
		sanwei.h=90;
		Xiaoli.speak(age,sanwei);
		//age������ֵ��sanwei���ݵ������ã���ַ��,C���ָ��
		System.out.println(age);
		System.out.println(sanwei.b);
	}
}
