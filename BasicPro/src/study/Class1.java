package study;
/**
 * 
 * @author tzh666
 *
 */

public class Class1 {

	int year,month,day;
	String name;
	
	void set(String n,int y,int m,int d)//�����Ա����
	{
		name=n;
		year=y;
		month=m;
		day=d;
	}
	
	void speak()
	{
		System.out.println(name+"��������"+year+"��"+month+"��"+day+"��");
	}
	
	public static void main(String args[]) 
	{
		Class1 tzh;
		tzh=new Class1();
		tzh.set("tzh",1,1,1);
		Class1 tzh666 = tzh;
		tzh666.set("tzh666",2,2,1);//�ı�tzh666����tzhҲ����Ӧ�ı�
		tzh.speak();
		tzh666.speak();
	}

		
}
