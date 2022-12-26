package thread;

class SellTicketDemo implements Runnable {
    //定义票的总数
    private int total = 200;
    //定义票的编号
    private int no = total+1;   
    //定义一个线程同步对象
    private Object obj = new Object(); 
    @Override
    public void run() {      
        while(true){
            //同步锁
            synchronized(this.obj){
                if(this.total > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String msg = Thread.currentThread().getName()+" 售出第   "+(this.no -this.total) +"  张票";
                    System.out.println(msg);
                    this.total--;
                }else{
                    System.out.println("票已售完，请下次再来！");
                    System.exit(0);
                }
            }
        }
    }
}
public class SaleTicketDemoTest{    
    public static void main(String[] args) {        
    	Runnable std = new SellTicketDemo();     
        //把对象放入线程中
        Thread t1 = new Thread(std,"售票窗口1");
        Thread t2 = new Thread(std,"售票窗口2");
        Thread t3 = new Thread(std,"售票窗口3");
        Thread t4 = new Thread(std,"售票窗口4");
		Thread t5 = new Thread(std,"售票窗口5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
		t5.start();
    }
}
