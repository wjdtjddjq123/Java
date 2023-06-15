package oop;

public class Test09 {
	public static void main(String[] args) {
		System.out.println(Class6.classVar);
		
		Class6 c6 = new Class6(5678);
		System.out.println(c6.instanceVar);
		
		Class6 c1,c2;
		c1 = new Class6(5678);
		c2 = new Class6(3579);
		
		System.out.println(c1.instanceVar);
		System.out.println(c2.instanceVar);
	}
}
