package test;
/**
 * Test2
 * @author tzh666
 *
 */

/******定义一个计算柱体底面积的接口area，包含计算底面积的方法*****/
interface area{
	public double Space();	
}

/******定义一个圆柱体类，包含成员变量、对成员变量赋值的构造方法、计算体积的方法*******/
class Cylinder extends Test2 implements area{
	
private double high;
private double r;

final static double PI = 3.1415926;

public Cylinder() {
	
	System.out.println("无参构造方法");

}

public Cylinder(double high,double r) {
	
	System.out.println("有参构造方法");
	this.high = high;
	this.r = r;
    
}

public double Space() {
	
	return PI*r*r;
	
}

public double Volume(double S) {
	
	return S*high;
	
}
	
}
    	
/*********主测试类，计算最后结果********/
public class Test2{
	
	public static double CylinderSpace;
	public static double CylinderVolume;
	
	public static void main(String[] args) {
		
		area CylinderTest = new Cylinder(3,2);
		
//		System.out.println(CylinderTest.Space());
		
		Cylinder cylinder = new Cylinder(3,2);
		System.out.println(cylinder.Volume(CylinderTest.Space()));
		
		
		
	/*	area[] CylinderTest = {new Cylinder(3,2)};//将CylinderTest定义为接口类型并赋值
		
		CylinderSpace = CylinderTest[0].Space();//计算底面积
		
		CylinderVolume = ((Cylinder) CylinderTest[0]).Volume(CylinderSpace);//计算体积
		
		System.out.println("圆柱的底面积为：" + CylinderSpace);	
		System.out.println("圆柱的体积为：" + CylinderVolume);	*/
	
	}

}



