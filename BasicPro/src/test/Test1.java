package test;
/**
 * Test1
 * @author tzh666
 *
 */
import java.util.Random;

public class Test1 {
		
/***********随机生成一个一维整数数组，数组长度为n，元素值不超过max************/
	public static void RandomArray(int n, int max, int key)
	{
		int[] array = new int[n];
	    Random r = new Random(n);
	    for(int i =0;i<n;i++)
	    	array[i] = r.nextInt(max+1);  
	    for(int i=0;i<n;i++)
		    System.out.print(array[i]+"  ");
	    System.out.println("");
	    System.out.print("该数组是否按升序排列，1代表是，0代表否:"+CheckOrder(array,n));
	    System.out.println("");
	    System.out.print("该数组的和为:"+Sum(array,n));
	    System.out.println("");
	    System.out.print("数组中是否有"+key+"？1代表有，0代表无:"+CheckKey(array,n,key));
	}
	
/**********判断数组中元素是否按升序排练，若是返回1，否返回0*********/
	public static int CheckOrder(int[] array,int n)
	{
		for(int i=0;i<n;i++)
			if(array[i]>array[i+1])
				return 0;
			else
				continue;
		return 1;
	}
	
/*********计算数组和**********/
	public static int Sum(int[] array,int n) {
		int S=0;
		for(int i=0;i<n;i++)
			S=S+array[i];
		return S;
	}

/*******判断某个元素,找到数组中的某个值,若有返回1，无返回0********/
	public static int CheckKey(int[] array,int n,int key) {
		for(int i=0;i<n;i++)
			if(array[i]==key)
				return 1;
			else
				continue;
	return 0;
	}
	
	public static void main(String[] args) {
		RandomArray(20,50,25);	
	}

}

