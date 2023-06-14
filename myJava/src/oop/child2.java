package oop;

public class child2 extends parent {
	
	
	other other;
	int num1;
	child2(){
		other = new other();
		num1 = 200;
	}
	void methodA() {
		System.out.println("child methodA");
	}
	void methodB() {
		System.out.println("Parent Num1 : "+super.num1);
		
	}
}
