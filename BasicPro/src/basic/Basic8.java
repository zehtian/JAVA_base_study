package basic;
/**
 * ð�ݷ�����
 * @author tzh666
 *
 */
public class Basic8 {
	//ð�ݷ����� ��С����
	public static void main(String[] args) {
		
		int temp;
		//�����ʼ��
		int arr[]= {4,21,0,-12,-3};
		
		//ѭ������n-1��
		for(int i=0;i<arr.length;i++) {
			//�Ƚϴ���n-1-i
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
