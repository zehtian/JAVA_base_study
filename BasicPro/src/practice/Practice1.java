package practice;

public class Practice1 {
	
	public static void main(String[] args) {
			
		int array[] = new int[] {1,5,2,3,6,9,4,7};
		int temp;
		
		for(int i=1;i<8;i++) {
			for(int j=0;j<8-i;j++) {
				if(array[j]<array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i:array) {
			System.out.print(i + " ");
		}
			
	}
	

}
