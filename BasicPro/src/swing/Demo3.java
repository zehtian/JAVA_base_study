package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 对话框窗口JDialog
 * @author tzh666
 *
 */
public class Demo3 extends JDialog {
	public Demo3(JFrame frame) {
		/**
		 * 父窗体对象 
		 * 对话框标题
		 * 对话框是否阻塞父窗体
		 */
		super(frame,"对话框标题",true);
		
		//获取窗体容器 并创建JLabel对话框并放置"这是一个对话框"
		Container c = getContentPane();
		c.add(new JLabel("这是一个对话框"));
		
//		setVisible(true);//最好放在外面使用
		setBounds(100, 100, 100, 100);//设置坐标大小
	}
	
	public static void main(String[] args) {
		//创建父窗体
		JFrame f = new JFrame("父窗体");
		f.setBounds(50,50,300,300);
		
		//创建容器和按钮
		Container c = f.getContentPane();
		JButton btn = new JButton("弹出对话框");
		
		//在容器上添加按钮
		c.setLayout(new FlowLayout());//设置布局，使用流布局
		c.add(btn);
		f.setVisible(true);//设置父窗体可见
	    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    //若点击按钮 执行	   new Demo3()
	    btn.addActionListener(new ActionListener() {//监听
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		Demo3 d = new Demo3(f);
	    		d.setVisible(true);//设置子窗体可见
	    	}
	    });
	    		
	}
	
}
