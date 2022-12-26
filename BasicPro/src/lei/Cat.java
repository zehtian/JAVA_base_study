package lei;

public class Cat extends Animal {
	
	private String address;
	
	public Cat() {
		super();//调用父类
		System.out.println("子类无参构造方法");

	}
	
	public Cat(String name,int age,String address) {
		super(name,age);
		this.address=address;
		System.out.println("子类有参构造方法");
	}
	
	public String getAddress() {
		return address;
	}
	
	/**
	 * 重写父类的say方法
	 */
	public void say() {
		super.say();//调用父类say方法
		System.out.println("我是一只猫，我叫"+this.getName()+"，我的年龄为"+this.getAge()+"我来自"+this.getAddress());
	}
	
	public static void main(String args[]) {
		Cat cat = new Cat("mmm",2,"huoxing");
	//	cat.setName("mmm");
	//	cat.setAge(2);
		cat.say();
		
	}

}
