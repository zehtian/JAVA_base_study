package swing;
/**
 * ͨ�÷���
 * @author tzh666
 *
 */

import java.awt.*;
import javax.swing.*;

public class Demo2 extends JFrame {//��Demo2Ҳ��Ϊһ������
	
	public Demo2() {

		setVisible(true);//���ô���ɼ�
		setTitle("�������");
		/**
		 * ����رչ���
		 * EXIT_ON_CLOSE:���ش��� ��ֹͣ����
		 * DO_NOTHING_ON_CLOSE:���κβ���
		 * HIDE_ON_CLOSE:���ش��� ����ֹͣ����
		 * DISPOSE_ON_CLOSE:�ͷŴ�����Դ ����һ��ֹͣ����
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 // setSize(300,200);//���ô�С ��λ������
	 // setLocation(200,200);//�������Ͻ����� ��λ������ 
	    setBounds(200,200,300,200);//���� ��С������ ��λ������ 
	    
	    //��ȡ��������
	    Container c = getContentPane();
	    c.setBackground(Color.WHITE);
	    JLabel l = new JLabel("����һ������");
	    c.add(l);//������
	//    c.remove(l);//ɾ�����
	    c.validate();//��֤�������
	//    f.setContentPane(c);//������������
	    
	    setResizable(false);//���ô����Ƿ���Ըı��С
	    System.out.println("x="+getX()+",y="+getY());
		
	}
	
	public static void main(String[] args) {
		new Demo2();	
	}
	

}
