package basic;

public class Basic4 {
	
	public static void main(String[] args) {
		//&& 都为true则返回true 否则返回false
		boolean b1=(5<3)&&(4>5);//后面的不执行，因为前面已经为false
		System.out.println("b1="+b1);
		
		//& 不短路与
		boolean b2=(5<3)&(4>5);
		System.out.println("b2="+b2);
		
		//一般都用&&，因为效率高
	}

}
