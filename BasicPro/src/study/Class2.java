package study;
/**
 * 接口
 * @author tzh666
 *
 */
interface drawTest{
	public void draw();
}

class Class0 extends Class2 implements drawTest{
	public void draw() {
		System.out.println("Class0.draw()");
	}
}

public class Class2 {
	public static void main(String[] args) {
		drawTest[] d ={new Class0()};
		
		for (int i = 0; i < d.length; i++) {
			d[i].draw(); // 调用draw()方法
		}
	System.out.println("Class.draw()");
	}
}
