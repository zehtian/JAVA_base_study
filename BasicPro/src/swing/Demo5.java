package swing;

import java.awt.Container;
import java.net.URL;

import javax.swing.*;

/**
 * 窗体中添加图片
 * 要在一个包下
 * @author tzh666
 *
 */
public class Demo5 extends JFrame {
	public Demo5() {
		setBounds(100,100,500,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		JLabel l=new JLabel("这是一个展示图片的标签");//使用标签展示
		
//		URL url = Demo5.class.getResource("java.png");//获取图片URL路径
//		System.out.println(url);
//		Icon icon = new ImageIcon(url);//获得相应路径下的图片文件   后面那个是实现类
		Icon icon = new ImageIcon("src/java.png");
		l.setIcon(icon);//添加图片
		l.setSize(20,20);//设置标签大小 无法改变图片大小
		c.add(l);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Demo5();
	}

}
