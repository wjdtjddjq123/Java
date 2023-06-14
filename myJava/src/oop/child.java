package oop;

public class child  extends parent {
	
	
	other other;
	int num2;
	child(){
		other = new other();
		num2 = 200;
	}
	void methodB() {
		System.out.println("methodB");
	}
}
