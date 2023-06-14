package chap07.Circle;

public class Circle5 {
	
	static Circle5 circle; // 클래스 파일의 circle메서드
	static final double PI = 3.141592;
	private int radius;
	
	private Circle5(int radius){
		this.setradius(radius);
	}
	
	static Circle5 getCircle5 (int radius) {
		if(Circle5.circle == null ) { 
			Circle5.circle = new Circle5(radius);
		}else{
			Circle5.circle.setradius(radius);
		}
		return Circle5.circle;
	}
	
	void setradius(int radius){
		if(radius>0) {
			this.radius = radius;	
		}else {
			this.radius = 1;
		}
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