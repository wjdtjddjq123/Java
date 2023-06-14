package chap07.Circle;

public class Circle {
	static final double PI = 3.141592;; //static final 변수는 반드시 선언과 동시에 초기화 해주어야한다.
	final int radius;
	static {
//		Circle.PI = 3.141592;
	}
	Circle (int radius){
		this.radius = 1234;
	}
	double getAre() {
		final double result;
		result = this.radius*radius*this.PI; 
		return result;
	}
}
//선언과 초기화를 할 수 없다