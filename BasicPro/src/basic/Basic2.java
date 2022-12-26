package basic;

public class Basic2 {
	
	public static void main(String args[]) {
		//自动类型转换 转换后的数据类型比转换前大
		short s=1;
		int i;
		//自动类型转换 short转int类型
		i=s;
		System.out.println("i="+i);
		
		//强制类型转换
		double d=1.333;
		float f;
		//把double类型数据转换成float类型
		f=(float)d;
		System.out.println("f="+f);
	}

}
