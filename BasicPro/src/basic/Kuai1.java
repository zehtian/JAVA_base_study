package basic;

public class Kuai1 {
	
		//ͨ�ù���� ÿ�ε��ù��췽��ʱ���Ƚ���ͨ�ù���� 
	    //��̬���������ִ�У���ֻ��ִ��һ��
	
		/**
		 * �����
		 */
		{
			System.out.println("ͨ�ù����");
		}
		
		static{
			System.out.println("��̬�����");
		}
		
		/**
		 * ���췽��һ
		 */
		public Kuai1() {
			System.out.println("���췽��һ");
		}
		
		/**
		 * ���췽����
		 */
		public Kuai1(int i) {
			System.out.println("���췽����");
		}
		
		public static void main(String[] args) {
			new Kuai1();   //ʵ����һ������ ������
			new Kuai1(1);
		}
	}


