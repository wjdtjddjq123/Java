package oop;

public class parent2 {
	int num1;
	
	// 자식 인스턴스가 생성될 때 항상 부모의 인스턴스가 먼저 생성된다.
	// 단, 자동 생성되는 부모 인스턴스는 매개변수가 없는 생성자를 이용하여 생성된다.
	
	parent2(){
		this.num1 = 100;
		System.out.println(" parent2 class instance 생성 ");
	}
}
