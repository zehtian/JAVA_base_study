package practice;

class angle{
	
	protected void demo() {
		System.out.println("tzh666");
	}
	
}

class Quderangle extends angle{
	
	protected void demo() {
		System.out.println("tzh888");
	}
	
}

class anything {
	
	
}

public class Practice2 {
	
	public static void main(String[] args) {
		
		angle p = new Quderangle();
		if(p instanceof Quderangle) {
			Quderangle q = (Quderangle)p; //����ת��
			q.demo();
		}
		
		//����ת��
		Quderangle r = new Quderangle();
		angle m = (angle)r;
		m.demo(); //�÷����Ѿ���������д
		
	/*	if(p instanceof anything) {
			}*/
		//p��anything���޼̳й�ϵ������ʹ��instanceof
		
		}
	
}
