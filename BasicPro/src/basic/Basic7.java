package basic;

/**
 * ����Ķ���ͳ�ʼ��
 * @author tzh666
 *
 */
public class Basic7 {
	
	public static void main(String[] args) {
		//����һ�����飬����̬��ʼ��
		int arr[]=new int[] {1,2,3};
		
		//��ͨ�ı������鷽ʽ
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------");
		
		//for each������������
		for(int j:arr)
			System.out.println(j);
		
		System.out.println("------------");

		//����һ�����飬Ȼ��̬��ʼ��
        //int����Ĭ�ϳ�ʼ��0
		int arr2[]=new int[3];
		
		for(int i:arr2) {
			System.out.println(i);
		}
		//arr.length ����    arr[0].length ����
		
	}

}
