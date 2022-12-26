package basic;

public class Kuai1 {
	
		//通用构造快 每次调用构造方法时会先进入通用构造快 
	    //静态代码块最先执行，但只会执行一次
	
		/**
		 * 构造块
		 */
		{
			System.out.println("通用构造块");
		}
		
		static{
			System.out.println("静态构造块");
		}
		
		/**
		 * 构造方法一
		 */
		public Kuai1() {
			System.out.println("构造方法一");
		}
		
		/**
		 * 构造方法二
		 */
		public Kuai1(int i) {
			System.out.println("构造方法二");
		}
		
		public static void main(String[] args) {
			new Kuai1();   //实例化一个对象 匿名类
			new Kuai1(1);
		}
	}


