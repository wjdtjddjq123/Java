package chap06;

public class Circle4 {
	//static double pi = 3.14; 이렇게 하지말것
	static double pi;
	int radius;
	
	static {
		Circle4.pi = 3.141592; // 초기화블럭, 클래스가 로드 될 때, 딱 한번만 실행
	}
	
	Circle4(){
		// Circle4.pi = 3.141592; 이렇게 하지말것.
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
