package basic;
/**
 * throw�����쳣
 * @author tzh666
 *
 */
public class Except3 {
	
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 0;
			if(b == 0) {
				//throw new NullPointerException("b=0,�����쳣");
			}
			int c = a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
