package chap07;

public class Circle2 {
	static final double PI = 3.141592;
	int radius;
	
	Circle2(int radius){
//		생성자 Circle2는 메서드이기 때문에 로직을 반영할 수 있다.
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