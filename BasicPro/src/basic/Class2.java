package basic;

/**
 * Class2类 
 * @author Administrator
 * 类 方法 
 */

public class Class2 {
	
	//形参，入参     若某一参数个数不固定，则用...
	//带返回值
	int speak(String name,int age,String ...hobbies) {
		System.out.println("我叫"+name+",我今年"+age+"岁了");
        System.out.print("我的爱好：");
        for(String hobby:hobbies) {
        	System.out.print(hobby+" ");
        }
        
        //获取爱好的长度
        int totalhobbies=hobbies.length;
        return totalhobbies;
	}
	
	public static void main(String[] args) {
		Class2 zhangsan=new Class2();
		int n=zhangsan.speak("张三",23,"唱","跳","rap","篮球");
        System.out.println("\n有"+n+"个还好");	
 	}

}
