package test;
/**
 * Test2
 * @author tzh666
 *
 */

/******����һ���������������Ľӿ�area���������������ķ���*****/
interface area{
	public double Space();	
}

/******����һ��Բ�����࣬������Ա�������Գ�Ա������ֵ�Ĺ��췽������������ķ���*******/
class Cylinder extends Test2 implements area{
	
private double high;
private double r;

final static double PI = 3.1415926;

public Cylinder() {
	
	System.out.println("�޲ι��췽��");

}

public Cylinder(double high,double r) {
	
	System.out.println("�вι��췽��");
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
    	
/*********�������࣬���������********/
public class Test2{
	
	public static double CylinderSpace;
	public static double CylinderVolume;
	
	public static void main(String[] args) {
		
		area CylinderTest = new Cylinder(3,2);
		
//		System.out.println(CylinderTest.Space());
		
		Cylinder cylinder = new Cylinder(3,2);
		System.out.println(cylinder.Volume(CylinderTest.Space()));
		
		
		
	/*	area[] CylinderTest = {new Cylinder(3,2)};//��CylinderTest����Ϊ�ӿ����Ͳ���ֵ
		
		CylinderSpace = CylinderTest[0].Space();//��������
		
		CylinderVolume = ((Cylinder) CylinderTest[0]).Volume(CylinderSpace);//�������
		
		System.out.println("Բ���ĵ����Ϊ��" + CylinderSpace);	
		System.out.println("Բ�������Ϊ��" + CylinderVolume);	*/
	
	}

}



