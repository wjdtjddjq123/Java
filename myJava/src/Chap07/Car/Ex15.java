package chap07.Car;

public class Ex15 {

	public static void main(String[] args) {
		Car myCar = new FireEngine();
//		자동차(부모)에서 초기화를 소방차(자식)로 함. ( FireEngine 멤버변수 사용 )
		FireEngine fire = (FireEngine)myCar;
//		소방차 선언 후 초기화를 소방차로 하는 것
//		소방차의 레퍼런스를 소방차가 가르키는 것 즉, 소방차 레퍼런스를 주입하는 것
		
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

