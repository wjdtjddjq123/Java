package oop;

public class Test1 {
	public static void main(String[] args) {
//		객체지향 2간계, 인스턴스 생성(레퍼런스 생성)
		Class1 C1 = new Class1();
//		
		System.out.println("num:"+C1.num);
		C1.methodA();
		
		C1.num = 1234;
		System.out.println("num:"+C1.num);
		
		
	}
}
