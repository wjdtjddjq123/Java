package Chap06;

public class Circle4 {
	
	static double pi;
	int radius;
	
	static{
//		�ʱ�ȭ Block, Ŭ������ ����Ǿ��� �� �ڵ����� �ʱ�ȭ ��Ű�¹�
		pi = 3.141592;
	}
	
	Circle4(){
//	Circle4.pi = 3.141592;
//	
	}
	
	static void setPi(double p) {
		Circle4.pi = p;
	}
	
	void setRadius(int rad) {
		radius = rad;
	}
	
	double getArea() {
		double area;
		area = radius*radius*Circle4.pi;
		
		return area;
	}
}
