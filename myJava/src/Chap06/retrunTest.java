package Chap06;

public class retrunTest {
	void noreturn() {
		
		System.out.println("첫번째 문장");
		System.out.println("두번째 문장");
		System.out.println("세번째 문장");
	}
	
	void return1() {
		
		System.out.println("return1 호출");
		return;
//		문장 끝 
	}
	String return2() {
		System.out.println("return2 호출");
		return "호출결과";
//		문장 끝
	}
}
