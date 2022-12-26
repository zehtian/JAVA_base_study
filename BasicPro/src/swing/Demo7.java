package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 提交按钮组件
 * @author tzh666
 *
 */
public class Demo7 extends JFrame {
	public Demo7() {
		setBounds(100, 100, 500, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2,5,5));
		
		JButton btn[] = new JButton[6];
		for(int i = 0;i<btn.length;i++) {
			btn[i] = new JButton();
			c.add(btn[i]);			
		}
		
		btn[0].setText("不可用");
		btn[0].setEnabled(false);
		
		btn[1].setText("有背景色");
		btn[1].setBackground(Color.RED);
		
		btn[2].setText("无边框");
		btn[2].setBorderPainted(false);
		
		btn[3].setText("有边框");
		btn[3].setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		Icon icon = new ImageIcon("src/imagebutton.jpg");//获取按钮
		btn[4].setIcon(icon);//给按钮设置图片
		btn[4].setToolTipText("图片按钮");//鼠标悬停提示
		
		btn[5].setText("可点击");
		btn[5].addActionListener(new ActionListener() { //添加事件监听
			
			@Override
			public void actionPerformed(ActionEvent e) {//监听触发的方法
				// TODO 自动生成的方法存根
				JOptionPane.showMessageDialog(Demo7.this,"点击按钮");//弹出小对话框
			}
		});
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Demo7();
	}

}
