package basic;
/**
 * throw�ؼ���
 * @author tzh666
 *
 */
class Except2 {

	public static void main(String[] args){
		try {
			int count = -10;
			if(count < 0) {
				throw new ArithmeticException("��Ա�����Ǹ���");
			}

			System.out.println("��ǰ����Ϊ��"+count);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	
				
		
		
		
	}

}
