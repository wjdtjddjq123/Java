package chap07.Circle;

public class Ex08 {

	public static void main(String[] args) {
		Circle3 circle = new Circle3(5);
		System.out.println("Area : "+circle.getArea());
		System.out.println("Area : "+circle.circlefre());
		
//		circle.radius = -5;
		circle.setradius(-5);
		System.out.println("Area : "+circle.circlefre());
	}
}
//  ��ü�� ������ ������ ��ü�� ��� ��쿡���� �� �� �� ����� �� ���� �� �ȴ�.
//	��ü�� �����ϴ� ����ʵ�� Private, �� ������ �� �ִ� ����� ����. 
//	�ʵ��� ���� ����� �� �ִ� get(��ȯ), set(����)  method�� �����ؾ��Ѵ�.
//	�޼���� ������ ���� �� ����, ����/�ݺ����� ����� ������ �̸� �̿��� �� ���� ����� ������ �� �ִ�.