package oop;

public class Class3 {
	static int classvar;
	
	
	static void classmthodA() {
		System.out.println("classmethodA");
	}
	
	static void classmthodB() {
		System.out.println("classVar:"+classvar);
		Class3.classmthodA();
	}
	void instanceMethodA() {
		System.out.println("instanceMetohdA");
	}
	void instanceMethodB() {
		Class3.classmthodA();
		System.out.println("instanceMetohdA");
	}
}
