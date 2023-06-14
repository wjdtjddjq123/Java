package chap07.Car;

public class Ex18 {

	public static void main(String[] args) {
		Car [] Car = new Car[3];
		
		Car[0] = new Car();
		Car[1] = new FireEngine();
		Car[2] = new Ambulance();
		
//		boolean t = true;
		
		for(Car myCar:Car) {
			myCar.drive();
//			�ҹ����̸� ���� �Ѹ��� �������̸� ���̷��� �︮�� �ڵ带 �ۼ��ϼ���.
			if(myCar instanceof FireEngine) {
				FireEngine fire = (FireEngine)myCar;
				fire.water();
			}else if(myCar instanceof Ambulance) {
				Ambulance ambulance = (Ambulance)myCar;
				ambulance.siren();
			}		
			myCar.stop();
		}
		
		}
}

