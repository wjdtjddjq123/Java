package chap07;

public class Ex07 {

	public static void main(String[] args) {
		Circle2 circle = new Circle2(-5);
		System.out.println("Area : "+circle.getArea());
		System.out.println("Area : "+circle.circlefre());
		
		circle.radius = -5;
		System.out.println("Area : "+circle.circlefre());
	}
}
//  ��ü�� ������ ������ ��ü�� ��� ��쿡���� �� �� �� ����� �� ���� �� �ȴ�.
//	��ü�� �����ϴ� ����ʵ�� Private, �� ������ �� �ִ� ����� ����. 
//	�ʵ��� ���� ����� �� �ִ� get(��ȯ), set(����)  method�� �����ؾ��Ѵ�.
//	�޼���� ������ ���� �� ����, ����/�ݺ����� ����� ������ �̸� �̿��� �� ���� ����� ������ �� �ִ�.