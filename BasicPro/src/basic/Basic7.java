package basic;

/**
 * 数组的定义和初始化
 * @author tzh666
 *
 */
public class Basic7 {
	
	public static void main(String[] args) {
		//定义一个数组，并静态初始化
		int arr[]=new int[] {1,2,3};
		
		//普通的遍历数组方式
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------");
		
		//for each方法遍历数组
		for(int j:arr)
			System.out.println(j);
		
		System.out.println("------------");

		//定义一个数组，然后动态初始化
        //int类型默认初始是0
		int arr2[]=new int[3];
		
		for(int i:arr2) {
			System.out.println(i);
		}
		//arr.length 行数    arr[0].length 列数
		
	}

}
