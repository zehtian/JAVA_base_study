package fanxing;
/**
 * �����˽�ö������
 * @author tzh666
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		Constants enumArray[] = Constants.values();//��ö���г�Ա��װ���������ʽ
		Constants c =  Constants.Constants_B;
		 /**
	     * compareTo:�Ƚ�����ö�ٶ����ڶ���ʱ��˳��
	     * ���壺����  ����0 �ȶ��壺����
	     */
		for(int i = 0;i<enumArray.length;i++) {
			System.out.println("ö�����ͳ�Աֵ��"+enumArray[i]);
			System.out.println(c + "��" + enumArray[i] + "�ıȽϽ��Ϊ��" + c.compareTo(enumArray[i]));
			System.out.println(enumArray[i]+"��ö�������е�����:"+enumArray[i].ordinal());
		}
		
	    Constants c1 =  Constants.Constants_A;
	    Constants c2 =  Constants.valueOf("Constants_A");//���ַ�������ת����ö������
	    
	    System.out.println("c1��c2�Ƿ���ȣ�"+(c1 == c2));
	  
	}

}
