package basic;
/**
 * throws�ڷ������׳��쳣
 * @author tzh666
 *
 */

public class Except1 {

	static void jisuan() throws Exception{
		int a = 1/0;
	}

	public static void main(String[] args)  {
		try{
			jisuan();
		}
		catch(Exception e) {
		//	e.printStackTrace();
			System.out.println("�쳣�Ѿ�����");
		}
	}
}

