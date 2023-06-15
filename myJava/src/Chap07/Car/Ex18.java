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
//			소방차이면 물을 뿌리고 구급차이면 사이렌을 울리는 코드를 작성하세요.
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

