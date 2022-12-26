package fanxing;
/**
 * 枚举
 * @author tzh666
 *
 */
public class Demo1{
	public static void doit(int c) {
		switch(c) {
		case Seasons.SPRING:
			System.out.println("doit():春天");
			break;
		case Seasons.SUMMER:
			System.out.println("doit():夏天");
			break;
		case Seasons.AUTUMN:
			System.out.println("doit():秋天");
			break;
		case Seasons.WINTER:
			System.out.println("doit():冬天");
			break;
		}
	}

	public static void doit2(Seasons2 s) {
		switch(s) {
		case SPRING:
			System.out.println("doit()2:春天");
			break;
		case SUMMER:
			System.out.println("doit()2:夏天");
			break;
		case AUTUMN:
			System.out.println("doit()2:秋天");
			break;
		case WINTER:
			System.out.println("doit()2:冬天");
			break;
		}
		
	}
    public static void main(String[] args) { 
    	doit(Seasons.WINTER);
    	doit2(Seasons2.WINTER);
    }
}
