package Chap07;

public class ClassB {
	int num2;
	
	ClassB(){
		this.num2 = 20;
		ClassA ClassA = new ClassA();
	}
	
	String method2() {
		return "classB 클래스의 method2 입니다. ";
	}
}
