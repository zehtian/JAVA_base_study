package test;
import java.util.Random;
/**
 * Test1
 * @author tzh666
 *
 */
class Array{
	
	private int array[];
	
/***********随机生成一个一维整数数组，数组长度为n，元素值不超过max************/	
	public void RandomArray(int n,int max){
		array=new int[n];
	    Random r=new Random(n);
		for(int i=0;i<n;i++)
	    	array[i]=r.nextInt(max+1);  
		for(int i=0;i<n;i++)
		    System.out.print(array[i]+"  ");
		System.out.println("");
	}
	
/**********判断数组中元素是否按升序排练，若是返回1，否返回0*********/
	public int CheckOrder(){
		int x=0;
		for(int temp:this.array){  //数组遍历 temp为数组值
			if(temp>=x)
				x=temp;		
			else
				return 0;		
		}
		return 1;
	}

/*********计算数组和**********/	
	public int Sum(){
		int Sum=0;
		for(int temp:this.array)
			Sum+=temp;
		return Sum;
	}

/*******判断某个元素,找到数组中的某个值,若有返回1，无返回0********/	
	public int CheckKey(int key){
		for(int temp:this.array)
			if(temp==key)
				return 1;
			else
				continue;
		return 0;
	}
}

public class Test3 {
	public static void main(String args[]){
		Array array = new Array();
		array.RandomArray(20,50);	
		System.out.print("该数组是否按升序排列，1代表是，0代表否:"+array.CheckOrder());
		System.out.println("");
		System.out.print("该数组的和为:"+array.Sum());
		System.out.println("");
		int key=11;
		System.out.print("数组中是否有"+key+"？1代表有，0代表无:"+array.CheckKey(key));
	}
}

