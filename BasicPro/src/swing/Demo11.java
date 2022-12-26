package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * �б�� JList
 * @author tzh666
 *
 */
public class Demo11 extends JFrame{
	public Demo11() {
		setBounds(100, 100, 217, 167);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		String items[] = {"Ԫ��1","Ԫ��2","Ԫ��3","Ԫ��4","Ԫ��5","Ԫ��6","Ԫ��7","Ԫ��8"};
//      JList<String> jl = new JList<>(items);
		/**
		 * �ù���ģ�͵ķ��������б�
		 */
		DefaultListModel<String> model = new DefaultListModel<String>();//�б�������ģ��
		for(String tmp:items)
			model.addElement(tmp);
		JList<String> jl = new JList<>();
		model.addElement("���Ԫ��");//����ģ�������Ԫ��
		jl.setModel(model);//Ϊ�б������ģ�� 
		
		/**
		 * SINGLE_SELECTION����ѡ
		 * SINGLE_INTERVAL_SELECTION��ֻ������ѡ������Ԫ��
		 * MULTIPLE_INTERVAL_SELECTION�����ѡ
		 */
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//����ѡ��ģʽ
		
		JScrollPane js = new JScrollPane(jl);//Ϊ�б����ӹ�����
		js.setBounds(10, 10, 100, 100);//���ù���������ʹ�С
		
		c.add(js);
		
		JButton btn = new JButton("ȷ��");
		btn.setBounds(120,90,70,25);
		btn.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				//��ȡ�б����ѡ�е�����Ԫ��
				java.util.List<String> values = jl.getSelectedValuesList(); 
				for(String tmp:values) {
					System.out.println(tmp);
				}
				System.out.println("-------end--------");
			
			}
		});
		
		c.add(btn);
		
		setVisible(true);
		
	}
	
public static void main(String[] args) {
	new Demo11();
}
}
