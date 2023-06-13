package chap06;

public class Ex6 {
	void noReturn() {
		System.out.println("첫 번째 문장");
		System.out.println("두 번째 문장");
		System.out.println("세 번째 문장");
	}
	void return1() {
		System.out.println("return1() 메서드 호출");
		return;
	}	
	String return2() {
		System.out.println("return2() 메서드 호출");
		return "호출결과";
	}
	public static void main(String[] args) {
		//Ex5실행결과와 동일한 결과를 출력하는 코드를 작성하세요.
		Ex6 exTest = new Ex6();
		exTest.noReturn();
		exTest.return1();
		
		System.out.print("returnvalue: " + exTest.return2());
	}
}
