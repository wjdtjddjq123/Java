package chap07.classlean;

public class ClassB {

	int num2;
	ClassA classA;
	
	ClassB() {
		this.num2 = 20;
		classA = new ClassA();
	}
	
	String method2() {
		return "ClassB Ŭ������ method2() �Դϴ�. ";
	}
}