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
 * �����б����� JComboBox
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
//		comboBox.addItem("���֤");//�������б����������
//		comboBox.addItem("ѧ��֤");
//		comboBox.addItem("����֤");
		
//		String items[] = {"����Ԫ��1","����Ԫ��2","����Ԫ��3"};
//		JComboBox<String> comboBox = new JComboBox<>(items);//ʹ��String��������б�Ԫ��
		
		JComboBox<String> comboBox = new JComboBox<>();
		String items[] = {"����Ԫ��1","����Ԫ��2","����Ԫ��3"};
		ComboBoxModel cm = new DefaultComboBoxModel<>(items); //���������б�ģ��
		comboBox.setModel(cm);//���б������ģ��
		
		comboBox.setBounds(10, 10, 85, 21);
		c.add(comboBox);
		
		comboBox.setEditable(true);//�Ƿ���Ա༭
		
		JButton btn = new JButton("��ӡ");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println("ѡ�е�������"+comboBox.getSelectedIndex());//��ȡѡ�е�����
				System.out.println("ѡ�е�ֵ��"+comboBox.getSelectedItem());//��ȡѡ�е�ֵ
			
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

