package chap06;

public class Circle3 {
	static double pi;
	int radius;
	
	static void setPi(double pi) {
		Circle3.pi = pi; //클래스마다 하나
	}
	
	void setRadius(int rad) {
		radius = rad; // 인스턴스 변수
	}
	
	double getArea() {
		double area;
		area = radius * radius * Circle3.pi;
		
		return area;
	}
}
