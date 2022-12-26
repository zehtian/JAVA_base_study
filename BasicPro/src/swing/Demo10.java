package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * 下拉列表框组件 JComboBox
 * @author tzh666
 *
 */
public class Demo10 extends JFrame{
	public Demo10(){
		setBounds(100,100,180,110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
//		JComboBox<String> comboBox = new JComboBox<>();
//		comboBox.addItem("身份证");//向下拉列表中添加数据
//		comboBox.addItem("学生证");
//		comboBox.addItem("工作证");
		
//		String items[] = {"数组元素1","数组元素2","数组元素3"};
//		JComboBox<String> comboBox = new JComboBox<>(items);//使用String添加下拉列表元素
		
		JComboBox<String> comboBox = new JComboBox<>();
		String items[] = {"数组元素1","数组元素2","数组元素3"};
		ComboBoxModel cm = new DefaultComboBoxModel<>(items); //创建下拉列表模型
		comboBox.setModel(cm);//向列表中添加模型
		
		comboBox.setBounds(10, 10, 85, 21);
		c.add(comboBox);
		
		comboBox.setEditable(true);//是否可以编辑
		
		JButton btn = new JButton("打印");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("选中的索引："+comboBox.getSelectedIndex());//获取选中的索引
				System.out.println("选中的值："+comboBox.getSelectedItem());//获取选中的值
			
			}
		});
		btn.setBounds(100, 10, 60, 20);
		c.add(btn);
		
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Demo10();
	}
}

