package yichang;

public class Test {
       public static void main(String[] args) {
	
    	   String playerType = "monkey";
    	   try {
			if(!playerType.equals("human")) {
				throw new MyException("�з�����ѡ�֣�"+playerType);
			   }
			System.out.println("��ʼ����");
		} catch (MyException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�����쳣��");
		}
    	   
}

}
