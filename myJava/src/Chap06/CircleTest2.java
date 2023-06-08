package Chap06;

public class CircleTest2 {
	public static void main(String[] args) {
		
	System.out.println("Circle2.pi: "+Circle2.pi);
	
	Circle2 c1, c2;
	c1 = new Circle2();
	c2 = new Circle2();
	
	
	System.out.println("c1.pi: "+c1.pi);
//	레퍼런스를 이용해서 접근하는 것도 가능하지만 잘 안 될수도 있음 그래서 클래스변수는 클래스 이름을 이용해서 접근하는것이 맞음
	System.out.println("c2.pi: "+c2.pi);
	
	c1.pi = 3.14; //Circle2.pi = 3.14;

	System.out.println("c1.pi: "+c1.pi);
	System.out.println("c2.pi: "+c2.pi);

	}
}
