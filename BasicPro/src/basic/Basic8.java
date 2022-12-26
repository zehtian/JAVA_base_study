package basic;
/**
 * 冒泡法排序
 * @author tzh666
 *
 */
public class Basic8 {
	//冒泡法排序 从小到大
	public static void main(String[] args) {
		
		int temp;
		//数组初始化
		int arr[]= {4,21,0,-12,-3};
		
		//循环次数n-1次
		for(int i=0;i<arr.length;i++) {
			//比较次数n-1-i
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
	    for(int i:arr) {
		    System.out.println(i);
	    }

    }
}
