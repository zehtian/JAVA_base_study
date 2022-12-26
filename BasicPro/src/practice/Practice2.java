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
			Quderangle q = (Quderangle)p; //向下转型
			q.demo();
		}
		
		//向上转型
		Quderangle r = new Quderangle();
		angle m = (angle)r;
		m.demo(); //该方法已经被子类重写
		
	/*	if(p instanceof anything) {
			}*/
		//p和anything类无继承关系，不能使用instanceof
		
		}
	
}
