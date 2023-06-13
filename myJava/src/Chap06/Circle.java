package chap06;

public class Circle {

	double pi;
	int radius;
	
	void setRadius(int rad) {
		radius = rad;
	}
	
	double getArea() {
		double area;
		area = radius * radius * pi;
		
		return area;
	}

}
