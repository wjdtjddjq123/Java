package chap07.Car;

public class Ex15 {

	public static void main(String[] args) {
		Car myCar = new FireEngine();
//		�ڵ���(�θ�)���� �ʱ�ȭ�� �ҹ���(�ڽ�)�� ��. ( FireEngine ������� ��� )
		FireEngine fire = (FireEngine)myCar;
//		�ҹ��� ���� �� �ʱ�ȭ�� �ҹ����� �ϴ� ��
//		�ҹ����� ���۷����� �ҹ����� ����Ű�� �� ��, �ҹ��� ���۷����� �����ϴ� ��
		
		myCar.drive();
		myCar.stop();
		
		fire.water();
		
		myCar = new Ambulance();
		Ambulance Amb = (Ambulance)myCar;
		
		myCar.drive();
		myCar.stop();
		Amb.siren();
		
	}
}

