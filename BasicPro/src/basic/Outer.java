package basic;

public class Outer {
	
	private int a=1;
	
	//定义内部类
	class Inner{
		public void show() {
			System.out.println(a);
		}
		
	}
	
	public void show() {
		Inner inner=new Inner();
		inner.show();
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();    //实例化外部类
		outer.show();
	}

}
