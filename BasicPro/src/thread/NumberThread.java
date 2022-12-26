package thread;
/**
 * Thread��ʵ���߳�
 * @author tzh666
 *
 */
public class NumberThread extends Thread{
	private String name;
	private int first;
	private int n;
	public NumberThread(String name,int first,int n) {
		// TODO �Զ����ɵĹ��캯�����
		super(name);
		//this.name = name;
		this.first = first;
		this.n = n;
	}
	
	public void run() {
		long time1 = System.currentTimeMillis();//��ʼʱ��
		System.out.println("\n"+this.getName()+"��ʼʱ��="+time1+"��");
		for(int i = 0;i<n;i++) {
			System.out.print((first+2*i)+" ");
		}
		long time2 = System.currentTimeMillis();//����ʱ��
		System.out.print(this.getName()+"����ʱ��="+time2+"����ʱ="+time1+"��");
	}
	
	public static void main(String[] args) {
		Thread thread1 = new NumberThread("�����߳�",1,20);
		thread1.start();
		Thread thread2 = new NumberThread("ż���߳�",2,10);
		thread2.start();
	}

}
