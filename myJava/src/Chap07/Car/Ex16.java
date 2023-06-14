package chap07.Car;

public class Ex16 {

	public static void main(String[] args) {
		Car myCar = new Car();
		FireEngine fire = new FireEngine();
		Ambulance ambulance = new Ambulance();
		
		System.out.println("myCar instanceof Car: "+ (myCar instanceof Car));
		System.out.println("myCar instanceof FireEngine: "+ (myCar instanceof FireEngine));
		System.out.println("myCar instanceof Ambulance: "+ (myCar instanceof Ambulance));
		
		
		System.out.println("fire instanceof Car: "+ (fire instanceof Car));
		System.out.println("fire instanceof FireEngine: "+ (fire instanceof FireEngine));
//		System.out.println("myCar instanceof Car: "+ (fire instanceof Ambulance));
		
		System.out.println("ambulance instanceof Car: "+ (ambulance instanceof Car));
//		System.out.println("myCar instanceof Car: "+ (ambulance instanceof FireEngine));
		System.out.println("ambulance56 instanceof Ambulance: "+ (ambulance instanceof Ambulance));
		}
}

