package chap07.ParentChild;

public class Child2 extends Parent2 {
	String gender;
	
	Child2(String name, String gender ){
		super(name);
		this.gender = gender;
		System.out.println("Child �ν��Ͻ� ����");
	}
	void methodA() {
		super.methodA();
		System.out.println("Child Ŭ���� methodA()");
	}
}