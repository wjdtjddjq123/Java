package Chap06;

public class CircleTest4 {
	public static void main(String[] args) {
		Circle3 circle1, circle2;
		
		Circle3.pi = (3.14);
		circle1 = new Circle3();
		circle2 = new Circle3();
		
		circle1.setRadius(5);
		circle2.setRadius(7);
		
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ�. \n",circle1.radius, circle1.getArea());
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ�. \n",circle2.radius, circle2.getArea());
		
		Circle3.pi = (3.141592);
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ�. \n",circle1.radius, circle1.getArea());
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ�. \n",circle2.radius, circle2.getArea());
	}
}
