package chap07;

public class Circle2 {
	static final double PI = 3.141592;
	int radius;
	
	Circle2(int radius){
//		������ Circle2�� �޼����̱� ������ ������ �ݿ��� �� �ִ�.
		if(radius>0) {
			this.radius = radius;	
		}else
			this.radius = 1 ;

	}
	double getArea() {
		return this.radius*this.radius*PI;
	}
	
	double circlefre() {
		return this.radius*2*PI;
	}
}