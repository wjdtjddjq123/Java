package Chap07;

public class Parent {
	
	String name;
	Parent(String name){
		this.name = name;
		System.out.println("parent 인스턴스 생성");
	}
	
	void methodA() {
		System.out.println("parent Class MethodA 생성");
	}
}
