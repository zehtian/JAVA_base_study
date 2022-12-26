package basic;

/**
 * Class3类
 * @author Administrator
 * 方法的值传递和引用传递
 */

class Sanwei{
	int b;//胸围
	int w;//腰围
	int h;//臀围
}

public class Class3{
	
    //因为age是值传递，因此还是23岁
	//但sanwei是引用传递，因此会改变
	void speak(int age,Sanwei sanwei) {
		System.out.println("我今年"+age+"岁了,我的三围是："+sanwei.b+","+sanwei.w+","+sanwei.h);
		age=24;
		sanwei.b=80;
	}
	
	public static void main(String[] args) {
		Class3 Xiaoli=new Class3();
		int age=23;
		Sanwei sanwei=new Sanwei();
		sanwei.b=90;
		sanwei.w=60;
		sanwei.h=90;
		Xiaoli.speak(age,sanwei);
		//age传的是值，sanwei传递的是引用（地址）,C里叫指针
		System.out.println(age);
		System.out.println(sanwei.b);
	}
}
