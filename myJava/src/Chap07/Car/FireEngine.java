package chap07.Car;

public class FireEngine extends Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("소방차가 갑니다. ");
	}
	
	void stop() {
		System.out.println("소방차가 멈춥니다.");
	}
	
	void water() {
		System.out.println("물을 뿌립니다.");
	}	
}
