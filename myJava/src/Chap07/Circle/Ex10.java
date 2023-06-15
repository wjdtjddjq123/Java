package chap07.Circle;

public class Ex10 {

	public static void main(String[] args) {
		Circle5 c1, c2, c3, c4;
		
		c1 = Circle5.getCircle5(3);
		System.out.println("Area : "+c1.getArea());
		System.out.println("circlefre : "+c1.circlefre());
		
		c2 = Circle5.getCircle5(4);
		System.out.println("Area : "+c1.getArea());
		System.out.println("circlefre : "+c1.circlefre());
		
		c3 = Circle5.getCircle5(5);
		System.out.println("Area : "+c1.getArea());
		System.out.println("circlefre : "+c1.circlefre());
		
		c4 = Circle5.getCircle5(6);
		System.out.println("Area : "+c1.getArea());
		System.out.println("circlefre : "+c1.circlefre());
		
		System.out.println("==================");
		System.out.println("c1==c2 : "+(c1==c2));
		System.out.println("c2==c3 : "+(c2==c3));
		System.out.println("c3==c4 : "+(c3==c4));
	}
}