package chap07;

public class Circle3 {
	static final double PI = 3.141592;
	private int radius;
	
	Circle3(int radius){
//		�Ͻ��� Final, radius�� ���� ������ �� ����
//		������ Circle2�� �޼����̱� ������ ������ �ݿ��� �� �ִ�.
		this.setradius(radius);
//		( �ݺ��� ������ ���ַ��� Ȱ���ϸ� �ȴ�. )
	}
	void setradius(int radius) {
//		set�� �̸��� set�ʵ�������Ѵ�. 
		if(radius>0) {
			this.radius = radius;	
		}else
			this.radius = 1 ;
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