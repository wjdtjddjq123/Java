package chap07.Car;

public class Ex14 {

	public static void main(String[] args) {
	Car myCar = new Car();
	try{
		FireEngine fire = (FireEngine)myCar;
		fire.drive();
		
	}catch(Exception e ) {
		e.printStackTrace();
	}

	}
}

