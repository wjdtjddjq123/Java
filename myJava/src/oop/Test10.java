package oop;

public class Test10 {
	public static void main(String[] args) {
		child ch= new child();
		System.out.println("num1 : "+ch.num1);
		ch.methodA();
		System.out.println("num2 : "+ch.num2);
		ch.methodB();
		System.out.println("num3 : "+ch.other.num3);
		ch.other.methodA();
	}
}
