package thread;
/**
 * Runnable接口实现线程
 * @author tzh666
 *
 */
public class NumberRunnable implements Runnable{

	private int first;
	private int end;
	
	public NumberRunnable(int first,int end){
		this.first = first;
		this.end = end;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=first;i<end;i++)
			System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		
		Runnable run1 = new NumberRunnable(1,20);
		Thread thread1 = new Thread(run1,"奇数线程");
		thread1.start();
	
	}

}
