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
 * 文本框 
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
		jt.setColumns(20);//设置文本框长度
		jt.setText("aaa");//设置文本
		jt.setFont(new Font("黑体",Font.PLAIN,20));//设置字体格式
		c.add(jt);
		
		JButton btn = new JButton("确认");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				System.out.println("文本框的内容为："+jt.getText());
				jt.setText("");//清空文本框
				jt.requestFocus();//获取光标
			}
		});
		
		c.add(btn);
		
        setVisible(true);
	}
	
public static void main(String[] args) {
	new Demo12();

}

}