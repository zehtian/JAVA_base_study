package study;
/**
 * 
 * @author tzh666
 *
 */

public class Class1 {

	int year,month,day;
	String name;
	
	void set(String n,int y,int m,int d)//定义成员方法
	{
		name=n;
		year=y;
		month=m;
		day=d;
	}
	
	void speak()
	{
		System.out.println(name+"的生日是"+year+"年"+month+"月"+day+"日");
	}
	
	public static void main(String args[]) 
	{
		Class1 tzh;
		tzh=new Class1();
		tzh.set("tzh",1,1,1);
		Class1 tzh666 = tzh;
		tzh666.set("tzh666",2,2,1);//改变tzh666对象，tzh也会相应改变
		tzh.speak();
		tzh666.speak();
	}

		
}
