package chap06;

public class Circle3 {
	static double pi;
	int radius;
	
	static void setPi(double pi) {
		Circle3.pi = pi; //Ŭ�������� �ϳ�
	}
	
	void setRadius(int rad) {
		radius = rad; // �ν��Ͻ� ����
	}
	
	double getArea() {
		double area;
		area = radius * radius * Circle3.pi;
		
		return area;
	}
}
