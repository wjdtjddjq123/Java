package chap06;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle;
		circle = new Circle();
		circle.pi = 3.141592;
		
		circle.setRadius(5);
		
		System.out.printf("�������� 5�� ���� ���̴� %.2f �Դϴ�.\n", circle.getArea());

		
		circle.setRadius(7);
		
		System.out.printf("�������� 7�� ���� ���̴� %.2f �Դϴ�.\n", circle.getArea());
	}

}
