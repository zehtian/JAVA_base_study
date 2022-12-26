package test;
/**
 * Test1
 * @author tzh666
 *
 */
import java.util.Random;

public class Test1 {
		
/***********�������һ��һά�������飬���鳤��Ϊn��Ԫ��ֵ������max************/
	public static void RandomArray(int n, int max, int key)
	{
		int[] array = new int[n];
	    Random r = new Random(n);
	    for(int i =0;i<n;i++)
	    	array[i] = r.nextInt(max+1);  
	    for(int i=0;i<n;i++)
		    System.out.print(array[i]+"  ");
	    System.out.println("");
	    System.out.print("�������Ƿ��������У�1�����ǣ�0�����:"+CheckOrder(array,n));
	    System.out.println("");
	    System.out.print("������ĺ�Ϊ:"+Sum(array,n));
	    System.out.println("");
	    System.out.print("�������Ƿ���"+key+"��1�����У�0������:"+CheckKey(array,n,key));
	}
	
/**********�ж�������Ԫ���Ƿ��������������Ƿ���1���񷵻�0*********/
	public static int CheckOrder(int[] array,int n)
	{
		for(int i=0;i<n;i++)
			if(array[i]>array[i+1])
				return 0;
			else
				continue;
		return 1;
	}
	
/*********���������**********/
	public static int Sum(int[] array,int n) {
		int S=0;
		for(int i=0;i<n;i++)
			S=S+array[i];
		return S;
	}

/*******�ж�ĳ��Ԫ��,�ҵ������е�ĳ��ֵ,���з���1���޷���0********/
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

