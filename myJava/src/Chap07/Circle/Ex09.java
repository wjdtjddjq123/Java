package chap07.Circle;

public class Ex09 {

	public static void main(String[] args) {
		Circle4 circle = null;
		try {
			circle = new Circle4(5);	
			System.out.println("Area : "+circle.getArea());
			System.out.println("circlefre : "+circle.circlefre());
			
			circle.setradius(-7);
			System.out.println("Area : "+circle.getArea());
			System.out.println("circlefre : "+circle.circlefre());
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
}
//		}		
//		try {
//			circle = new Circle4(6);
//				
//		}
//		catch(Exception e){
//			System.out.print(e.getMessage());
//		}
//		System.out.println("Area : "+circle.getArea());
//		System.out.println("circlefre : "+circle.circlefre());
//	}
//		circle.radius = -5;
//		circle.setradius(-5);
		
//  객체가 가지는 데이터 자체가 어떠한 경우에서라도 잘 못 된 경우라면 그 경우라도 안 된다.
//	객체가 제공하는 모든필드는 Private, → 접근할 수 있는 방법이 없다. 
//	필드의 값을 사용할 수 있는 get(반환), set(설정)  method를 제공해야한다.
//	메서드는 로직을 가질 수 있음, 제어/반복문을 사용할 수있음 이를 이용해 잘 못된 사용을 제한할 수 있다.