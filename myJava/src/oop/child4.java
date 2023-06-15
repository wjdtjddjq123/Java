package oop;

public class child4 extends parent3 {
	
	int num2;
	// 1. 부모의 매개변수가 없는 인스턴스를 만들어준다.
	// 2. 부모의 매개변수가 있는 생성자를 호출한다.
	
	child4(int num1, int num2){
		super(num1); // Super를 사용하기 위해서는 This와 같이 생성자 안에서 첫번째 문장이어야 한다.
//		자식으로 가려진 부모를 명시적으로 호출한다 = Super()
		this.num2 = num2;
		System.out.println(" child3 class instance 생성 ");
	}
}
