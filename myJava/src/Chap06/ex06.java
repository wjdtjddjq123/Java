package Chap06;
/*
 

*/
public class ex06 {
	public static void main(String[] args) {
		/*ex5 실행 결과와 동일한 결과를 출력하는 코드를 작성하세요. */
		ex06 a = new ex06();
		a.noreturn();
		a.return1();
		System.out.println(a.return2());
		
	}
	
	void noreturn() {
		
		System.out.println("첫번째 문장");
		System.out.println("두번째 문장");
		System.out.println("세번째 문장");
		}
		
	void return1() {
		System.out.println("return1 호출");
		return;
//			문장 끝 
		}
		
	String return2() {
		System.out.println("return2 호출");
		return "호출결과";
//			문장 끝
	}
}