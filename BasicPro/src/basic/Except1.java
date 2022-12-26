package basic;
/**
 * throws在方法中抛出异常
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
			System.out.println("异常已经处理！");
		}
	}
}

