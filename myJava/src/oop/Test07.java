package oop;
public class Test07 {
	public static void main(String[] args) {
		Class4 c4 = new Class4();
		
		System.out.println(c4.add(10,20));
		System.out.println(c4.add(10.5,20.5));
		System.out.println(c4.add(new int[] {10,20,30,40,50}));
//		배열안에 레퍼런스를 일회용으로 사용하는방법
	}
}
