package chap07;

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
		
//  ��ü�� ������ ������ ��ü�� ��� ��쿡���� �� �� �� ����� �� ���� �� �ȴ�.
//	��ü�� �����ϴ� ����ʵ�� Private, �� ������ �� �ִ� ����� ����. 
//	�ʵ��� ���� ����� �� �ִ� get(��ȯ), set(����)  method�� �����ؾ��Ѵ�.
//	�޼���� ������ ���� �� ����, ����/�ݺ����� ����� ������ �̸� �̿��� �� ���� ����� ������ �� �ִ�.