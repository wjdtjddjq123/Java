package chap07.Car;

public class Ex12 {
	public static void main(String[] args) {
		
		Car [] Car = new Car[3];
		
		Car[0] = new Car();
		Car[1] = new FireEngine();
		Car[2] = new Ambulance();
		
		for(Car myCar:Car) {
			myCar.drive();
		}
		
	}
}

