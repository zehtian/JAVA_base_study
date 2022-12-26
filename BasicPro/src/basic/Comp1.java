package basic;

public class Comp1 {
	
	private String name;
	private int age;
	
	/**
	 * 默认构造方法 
	 * 假如没有构造方法，则系统会自动生成一个默认的构造方法，方法名为类名；若有构造方法，系统不会自动生成方法
	 */
	/*Comp1(){
		System.out.println("默认构造方法");
	
	}*/
	
	/**
	 * 有参数的构造方法 构造方法的重载
	 */
	Comp1(String name2,int age2){
		name=name2;
		age=age2;
		System.out.println("有参数的构造方法");
		
	}
	
	public void say() {
		System.out.println("我叫"+name+",我今年"+age+"岁了");
	}

	public static void main(String[] args) {
		//Comp1 comp=new Comp1();
		Comp1 comp2=new Comp1("张三",23);
		comp2.say();
		
	}
}
