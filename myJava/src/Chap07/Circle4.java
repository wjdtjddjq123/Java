package chap07;

public class Circle4 {
	static final double PI = 3.141592;
	private int radius;
	
	Circle4(int radius)throws Exception {
//		암시적 Final, radius의 값을 변경할 수 없음
//		생성자 Circle2는 메서드이기 때문에 로직을 반영할 수 있다.
		this.setradius(radius);
//		( 반복된 구분을 없애려면 활용하면 된다. )
	}
	void setradius(int radius) throws Exception {
//		set의 이름은 set필드명으로한다. 
		if(radius>0) {
			this.radius = radius;	
		}else {
			throw new Exception("잘못된 원의 반지름입니다.");
		}
//			this.radius = 1 ;
	}
	int getRadius() {
		return this.radius;
	}
	double getArea() {
		return this.radius*this.radius*PI;
	}
	
	double circlefre() {
		return this.radius*2*PI;
	}
}