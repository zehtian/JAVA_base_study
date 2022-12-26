package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 单选按钮 JRadioButton
 * @author tzh666
 *
 */
public class Demo8 extends JFrame{
	public Demo8(){
		setBounds(100,100,180,110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JRadioButton left = new JRadioButton("左");
		JRadioButton right = new JRadioButton("右");
		
		c.add(left);
		c.add(right);
		
		ButtonGroup group = new ButtonGroup();//按钮组
		group.add(left);//把单选按钮放到按钮组中
		group.add(right);
		
		left.setSelected(true);//默认选中
		
		JButton btn = new JButton("打印");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.out.println(left.getText()+"按钮选中状态"+left.isSelected());
				System.out.println(right.getText()+"按钮选中状态"+right.isSelected());
				group.clearSelection();//按钮组清空选项 即按下按钮之后选项清空
			}
		});
		
		c.add(btn);
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Demo8();
	}

}
