package practice;

import java.util.ArrayList;
import java.util.List;

public class Demo{
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("tzh666");
		List<?> list2 = list1;
		List<?> list3 = new ArrayList<>();
		
		//ʹ��ͨ����Ķ����ܼ����µ���Ϣ��ֻ�ܻ�ȡ��ɾ��
		System.out.println(list2.get(0));
	//	list2.set(0, "aaa");
	//	list3.add("aaa");
		list3.remove(0);

		
	}

}
