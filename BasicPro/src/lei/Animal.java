package lei;
/**
 * ��ļ̳�
 * @author tzh666
 *
 */
public class Animal {
	
	private String name;
	private int age;
	
	public Animal() {
		System.out.println("�����޲ι��췽��");
	}
	
	public Animal(String name, int age ) {
		System.out.println("�����вι��췽��");
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
		System.out.println("����һ������ҽ�"+this.getName()+"���ҵ�����Ϊ"+this.getAge());
	}
}
