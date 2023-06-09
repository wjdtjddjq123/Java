package Chap07;

public class Child extends Parent {
	
	String gender;
	
	Child(String name, String gender){
		super(name);
		this.gender = gender;
		System.out.println("Child 牢胶畔胶 积己");
	}
	void methodA() {
		super.methodA();
		System.out.println("Child Class MethodA 积己");
	}
}
