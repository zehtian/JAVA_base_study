package swing;

import java.awt.*;
import javax.swing.*;

public class Demo1 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("title"); //�����������
		f.setVisible(true);//���ô���ɼ�
		
		/**
		 * ����رչ���
		 * EXIT_ON_CLOSE:���ش��� ��ֹͣ����
		 * DO_NOTHING_ON_CLOSE:���κβ���
		 * HIDE_ON_CLOSE:���ش��� ����ֹͣ����
		 * DISPOSE_ON_CLOSE:�ͷŴ�����Դ ����һ��ֹͣ����
		 */
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 // f.setSize(300,200);//���ô�С ��λ������
	 // f.setLocation(200,200);//�������Ͻ����� ��λ������ 
	    f.setBounds(200,200,300,200);//���� ��С������ ��λ������ 
	    
	    //��ȡ��������
	    Container c = f.getContentPane();
	    c.setBackground(Color.WHITE);
	    JLabel l = new JLabel("����һ������");
	    c.add(l);//������
	//    c.remove(l);//ɾ�����
	    c.validate();//��֤�������
	//    f.setContentPane(c);//������������
	    
	    f.setResizable(false);//���ô����Ƿ���Ըı��С
	    System.out.println("x="+f.getX()+",y="+f.getY());

	}

}
