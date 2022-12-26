package basic;

public class Import1test {
	
	//同一个包 可以直接引用，若不同包 则需要导入相关类，用import
	public static void main(String[] args) {
		Import1 import1=new Import1();
		import1.setA(2);
		int a=import1.getA();
		System.out.println(a);
	}

}
