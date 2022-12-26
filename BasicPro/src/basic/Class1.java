package basic;

/**
 * Class1类
 * @author Administrator
 * 类
 */

public class Class1 {
	String name;           //在类中，定义一个姓名name字符串
    int age;            //在类中，定义一个年龄age属性
    
    public String speak() {
        return "我叫"+name+"我今年"+age+"岁了";
    }
    
    public static void main(String[] args) {
    	//定义一个Class1类的对象zhangsan
    	Class1 zhangsan;
    	//实例化
    	zhangsan=new Class1();
    	zhangsan.name="张三";
    	zhangsan.age=23;
    	System.out.println(zhangsan.speak());
    }
}
