package chap07;

public class Circle4 {
	static final double PI = 3.141592;
	private int radius;
	
	Circle4(int radius)throws Exception {
//		�Ͻ��� Final, radius�� ���� ������ �� ����
//		������ Circle2�� �޼����̱� ������ ������ �ݿ��� �� �ִ�.
		this.setradius(radius);
//		( �ݺ��� ������ ���ַ��� Ȱ���ϸ� �ȴ�. )
	}
	void setradius(int radius) throws Exception {
//		set�� �̸��� set�ʵ�������Ѵ�. 
		if(radius>0) {
			this.radius = radius;	
		}else {
			throw new Exception("�߸��� ���� �������Դϴ�.");
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