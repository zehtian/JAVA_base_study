package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 多选按钮 JCheckBox
 * @author tzh666
 *
 */
public class Demo9 extends JFrame{
	public Demo9(){
		setBounds(100,100,180,110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox c1 = new JCheckBox("1");
		JCheckBox c2 = new JCheckBox("2");
		JCheckBox c3 = new JCheckBox("3");
		
		c.add(c1);
		c.add(c2);
		c.add(c3);

		c1.setSelected(true);
		
		JButton btn = new JButton("打印");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.out.println(c1.getText()+"复选框选中状态"+c1.isSelected());
				System.out.println(c2.getText()+"复选框选中状态"+c2.isSelected());
				System.out.println(c3.getText()+"复选框选中状态"+c3.isSelected());
			
			}
		});
		
		c.add(btn);
		
		setVisible(true);

	}
	public static void main(String[] args) {
		new Demo9();
	}
}
