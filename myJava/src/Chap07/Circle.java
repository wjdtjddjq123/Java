package chap07;

public class Circle {
	static final double PI = 3.141592;; //static final ������ �ݵ�� ����� ���ÿ� �ʱ�ȭ ���־���Ѵ�.
	final int radius;
	static {
//		Circle.PI = 3.141592;
	}
	Circle (int radius){
		this.radius = 1234;
	}
	double getAre() {
		final double result;
		result = this.radius*radius*Circle.PI; 
		return result;
	}
}
//����� �ʱ�ȭ�� �� �� ����