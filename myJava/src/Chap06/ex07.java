package Chap06;
/*
 

*/
public class ex07 {

	public static void main(String[] args) {
		
		ex07 a = new ex07();
		int radius = 7;
		a.printCharacter('*', 50);
		a.printTitle();
		a.printCharacter('*', 50);
		
		System.out.printf("반지름이 %d인 원의 반지름 넓이는 %f입니다. ", radius, a.getCircleArea(radius));
		
	}
	
	
	double getCircleArea ( int radius) {
		double result; 
		result = radius * radius * getPi();	
		return result;
//		반지름을 입력으로 받아 원의 넓이를 계산하여 반환하는 메서드
	}
	
	void printTitle() {
// 		프로그램의 제목을 출력하는 메서드
//		입력값, 반환값 X
		System.out.println("\t 원의 넓이 계산 프로그램");
	}
	
	
	
	void printCharacter(char ch, int count ) {
// 		입력으로 주어진 문자를 count 만큼 출력하는 메서드
//		입력값O, 반환값 X
			for (int i =0; i < count; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	
	double getPi() {
//		Pi 값을 반환하는 메서드
//		입력값 X, 반환값O
		double pi = 3.14;
		return pi;
	}
	

}
	