package oop;

public class Test1 {
	public static void main(String[] args) {
//		��ü���� 2����, �ν��Ͻ� ����(���۷��� ����)
		Class1 C1 = new Class1();
//		
		System.out.println("num:"+C1.num);
		C1.methodA();
		
		C1.num = 1234;
		System.out.println("num:"+C1.num);
		
		
	}
}
