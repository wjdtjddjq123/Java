package chap06;

public class Circle4 {
	//static double pi = 3.14; �̷��� ��������
	static double pi;
	int radius;
	
	static {
		Circle4.pi = 3.141592; // �ʱ�ȭ��, Ŭ������ �ε� �� ��, �� �ѹ��� ����
	}
	
	Circle4(){
		// Circle4.pi = 3.141592; �̷��� ��������.
	}
	
	static void setPi(double pi) {
		Circle4.pi = pi;
	}
	
	void setRadius(int rad) {
		radius = rad;
	}
	
	double getArea() {
		double area;
		area = radius * radius * Circle4.pi;
		
		return area;
		}
}
