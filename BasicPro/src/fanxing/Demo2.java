package fanxing;
/**
 * 深入了解枚举类型
 * @author tzh666
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		Constants enumArray[] = Constants.values();//将枚举中成员封装成数组的形式
		Constants c =  Constants.Constants_B;
		 /**
	     * compareTo:比较两个枚举对象在定义时的顺序
	     * 后定义：正数  自身：0 先定义：负数
	     */
		for(int i = 0;i<enumArray.length;i++) {
			System.out.println("枚举类型成员值："+enumArray[i]);
			System.out.println(c + "与" + enumArray[i] + "的比较结果为：" + c.compareTo(enumArray[i]));
			System.out.println(enumArray[i]+"在枚举类型中的索引:"+enumArray[i].ordinal());
		}
		
	    Constants c1 =  Constants.Constants_A;
	    Constants c2 =  Constants.valueOf("Constants_A");//把字符串类型转化成枚举类型
	    
	    System.out.println("c1与c2是否相等？"+(c1 == c2));
	  
	}

}
