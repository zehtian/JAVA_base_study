package basic;
/**
 * throw更改异常
 * @author tzh666
 *
 */
public class Except3 {
	
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 0;
			if(b == 0) {
				//throw new NullPointerException("b=0,发生异常");
			}
			int c = a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
