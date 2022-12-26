package thread;

class SellTicketDemo implements Runnable {
    //����Ʊ������
    private int total = 200;
    //����Ʊ�ı��
    private int no = total+1;   
    //����һ���߳�ͬ������
    private Object obj = new Object(); 
    @Override
    public void run() {      
        while(true){
            //ͬ����
            synchronized(this.obj){
                if(this.total > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String msg = Thread.currentThread().getName()+" �۳���   "+(this.no -this.total) +"  ��Ʊ";
                    System.out.println(msg);
                    this.total--;
                }else{
                    System.out.println("Ʊ�����꣬���´�������");
                    System.exit(0);
                }
            }
        }
    }
}
public class SaleTicketDemoTest{    
    public static void main(String[] args) {        
    	Runnable std = new SellTicketDemo();     
        //�Ѷ�������߳���
        Thread t1 = new Thread(std,"��Ʊ����1");
        Thread t2 = new Thread(std,"��Ʊ����2");
        Thread t3 = new Thread(std,"��Ʊ����3");
        Thread t4 = new Thread(std,"��Ʊ����4");
		Thread t5 = new Thread(std,"��Ʊ����5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
		t5.start();
    }
}
