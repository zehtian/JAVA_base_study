package practice;
/**
 * ·ºÐÍ Class<T>
 * @author tzh666
 *
 */
public class Practice4<T>{
	T over;

	public T getOver() {
		return over;
	}

	public void setOver(T over) {
		this.over = over;
	} 

	public static void main(String[] args) {
		Practice4<Boolean> d1 = new Practice4<Boolean>();
		d1.setOver(true);
		System.out.println(d1.getOver());
	}
}
