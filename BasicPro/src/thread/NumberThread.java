package thread;
/**
 * Thread类实现线程
 * @author tzh666
 *
 */
public class NumberThread extends Thread{
	private String name;
	private int first;
	private int n;
	public NumberThread(String name,int first,int n) {
		// TODO 自动生成的构造函数存根
		super(name);
		//this.name = name;
		this.first = first;
		this.n = n;
	}
	
	public void run() {
		long time1 = System.currentTimeMillis();//开始时间
		System.out.println("\n"+this.getName()+"开始时间="+time1+"，");
		for(int i = 0;i<n;i++) {
			System.out.print((first+2*i)+" ");
		}
		long time2 = System.currentTimeMillis();//结束时间
		System.out.print(this.getName()+"结束时间="+time2+"，耗时="+time1+"，");
	}
	
	public static void main(String[] args) {
		Thread thread1 = new NumberThread("奇数线程",1,20);
		thread1.start();
		Thread thread2 = new NumberThread("偶数线程",2,10);
		thread2.start();
	}

}
