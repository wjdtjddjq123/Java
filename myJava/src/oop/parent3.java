package oop;

public class parent3 {
	int num1;
	
	// 자식 인스턴스가 생성될 때 항상 부모의 인스턴스가 먼저 생성된다.	
	parent3(int num1){
		this.num1 = num1;
		System.out.println(" parent3 class instance 생성 ");
	}
}
