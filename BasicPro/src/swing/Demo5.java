package swing;

import java.awt.Container;
import java.net.URL;

import javax.swing.*;

/**
 * ���������ͼƬ
 * Ҫ��һ������
 * @author tzh666
 *
 */
public class Demo5 extends JFrame {
	public Demo5() {
		setBounds(100,100,500,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		JLabel l=new JLabel("����һ��չʾͼƬ�ı�ǩ");//ʹ�ñ�ǩչʾ
		
//		URL url = Demo5.class.getResource("java.png");//��ȡͼƬURL·��
//		System.out.println(url);
//		Icon icon = new ImageIcon(url);//�����Ӧ·���µ�ͼƬ�ļ�   �����Ǹ���ʵ����
		Icon icon = new ImageIcon("src/java.png");
		l.setIcon(icon);//���ͼƬ
		l.setSize(20,20);//���ñ�ǩ��С �޷��ı�ͼƬ��С
		c.add(l);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Demo5();
	}

}
