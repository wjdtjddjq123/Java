package Chap06;

public class Circle3 {
	static double pi;
	int radius;
	
	static void setPi(double p) {
		Circle3.pi = p;
	}
	
	void setRadius(int rad) {
		radius = rad;
	}
	
	double getArea() {
		double area;
		area = radius*radius*Circle3.pi;
		
		return area;
	}
}
