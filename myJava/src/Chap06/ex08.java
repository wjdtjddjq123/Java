package Chap06;
public class ex08 {
	
	void changeparam(int num) {
		num *= 2;
		System.out.println("[chanegeParam()] num:"+ num);
	}
	
	public static void main(String[] args) {
		int num =1234;
		System.out.println("메서드 호출 전 num:"+ num);
		
		ex08 a = new ex08();
//		changeparam() 메서드 호출
		a.changeparam(num);
//		call by value 호출 : 값에 의한 호출 (변수의 값을 복사해서 넘겨주는 것)	
		System.out.println("메서드 호출 후 num:"+ num);
	}
}
	