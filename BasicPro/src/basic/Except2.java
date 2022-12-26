package basic;
/**
 * throw关键字
 * @author tzh666
 *
 */
class Except2 {

	public static void main(String[] args){
		try {
			int count = -10;
			if(count < 0) {
				throw new ArithmeticException("人员数量是负数");
			}

			System.out.println("当前人数为："+count);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	
				
		
		
		
	}

}
