package lei;

public class Cat extends Animal {
	
	private String address;
	
	public Cat() {
		super();//���ø���
		System.out.println("�����޲ι��췽��");

	}
	
	public Cat(String name,int age,String address) {
		super(name,age);
		this.address=address;
		System.out.println("�����вι��췽��");
	}
	
	public String getAddress() {
		return address;
	}
	
	/**
	 * ��д�����say����
	 */
	public void say() {
		super.say();//���ø���say����
		System.out.println("����һֻè���ҽ�"+this.getName()+"���ҵ�����Ϊ"+this.getAge()+"������"+this.getAddress());
	}
	
	public static void main(String args[]) {
		Cat cat = new Cat("mmm",2,"huoxing");
	//	cat.setName("mmm");
	//	cat.setAge(2);
		cat.say();
		
	}

}
