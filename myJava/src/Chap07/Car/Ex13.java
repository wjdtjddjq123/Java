package chap07.Car;

public class Ex13 {
	
	void driveCar(Car myCar) {
		myCar.drive();
	}
	
	
	public static void main(String[] args) {
		Ex13 ex13 = new Ex13();
		
		Car myCar = new Car();
		FireEngine fire = new FireEngine();
		Ambulance ambulance = new Ambulance();
		
		ex13.driveCar(myCar);
		ex13.driveCar(fire);
		ex13.driveCar(ambulance);
	}
}

