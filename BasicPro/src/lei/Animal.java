package lei;
/**
 * 类的继承
 * @author tzh666
 *
 */
public class Animal {
	
	private String name;
	private int age;
	
	public Animal() {
		System.out.println("父类无参构造方法");
	}
	
	public Animal(String name, int age ) {
		System.out.println("父类有参构造方法");
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void say() {
		System.out.println("我是一个动物，我叫"+this.getName()+"，我的年龄为"+this.getAge());
	}
}
