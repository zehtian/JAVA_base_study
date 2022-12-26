package test;
import java.util.Random;
/**
 * Test1
 * @author tzh666
 *
 */
class Array{
	
	private int array[];
	
/***********�������һ��һά�������飬���鳤��Ϊn��Ԫ��ֵ������max************/	
	public void RandomArray(int n,int max){
		array=new int[n];
	    Random r=new Random(n);
		for(int i=0;i<n;i++)
	    	array[i]=r.nextInt(max+1);  
		for(int i=0;i<n;i++)
		    System.out.print(array[i]+"  ");
		System.out.println("");
	}
	
/**********�ж�������Ԫ���Ƿ��������������Ƿ���1���񷵻�0*********/
	public int CheckOrder(){
		int x=0;
		for(int temp:this.array){  //������� tempΪ����ֵ
			if(temp>=x)
				x=temp;		
			else
				return 0;		
		}
		return 1;
	}

/*********���������**********/	
	public int Sum(){
		int Sum=0;
		for(int temp:this.array)
			Sum+=temp;
		return Sum;
	}

/*******�ж�ĳ��Ԫ��,�ҵ������е�ĳ��ֵ,���з���1���޷���0********/	
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
		System.out.print("�������Ƿ��������У�1�����ǣ�0�����:"+array.CheckOrder());
		System.out.println("");
		System.out.print("������ĺ�Ϊ:"+array.Sum());
		System.out.println("");
		int key=11;
		System.out.print("�������Ƿ���"+key+"��1�����У�0������:"+array.CheckKey(key));
	}
}

