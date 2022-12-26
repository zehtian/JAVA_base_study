package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * �ı��� 
 * @author tzh666
 *
 */
public class Demo12 extends JFrame {
	public Demo12() {
		setBounds(100, 100, 250, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField jt = new JTextField();
		jt.setColumns(20);//�����ı��򳤶�
		jt.setText("aaa");//�����ı�
		jt.setFont(new Font("����",Font.PLAIN,20));//���������ʽ
		c.add(jt);
		
		JButton btn = new JButton("ȷ��");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				System.out.println("�ı��������Ϊ��"+jt.getText());
				jt.setText("");//����ı���
				jt.requestFocus();//��ȡ���
			}
		});
		
		c.add(btn);
		
        setVisible(true);
	}
	
public static void main(String[] args) {
	new Demo12();

}

}