package fanxing;
/**
 * ö��
 * @author tzh666
 *
 */
public class Demo1{
	public static void doit(int c) {
		switch(c) {
		case Seasons.SPRING:
			System.out.println("doit():����");
			break;
		case Seasons.SUMMER:
			System.out.println("doit():����");
			break;
		case Seasons.AUTUMN:
			System.out.println("doit():����");
			break;
		case Seasons.WINTER:
			System.out.println("doit():����");
			break;
		}
	}

	public static void doit2(Seasons2 s) {
		switch(s) {
		case SPRING:
			System.out.println("doit()2:����");
			break;
		case SUMMER:
			System.out.println("doit()2:����");
			break;
		case AUTUMN:
			System.out.println("doit()2:����");
			break;
		case WINTER:
			System.out.println("doit()2:����");
			break;
		}
		
	}
    public static void main(String[] args) { 
    	doit(Seasons.WINTER);
    	doit2(Seasons2.WINTER);
    }
}
