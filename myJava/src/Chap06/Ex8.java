package chap06;

public class Ex8 {
	
	void changeParam(int num) {
		num *=2;
		System.out.println("[changeParam] num: " + num);

	}
	
	public static void main(String[] args) {
		int num = 1234;
		System.out.println("[메서드 호출 전] num: " + num);

		//changeParam(num) 메서드 호출
		
		Ex8 ex8 = new Ex8();
		ex8.changeParam(num);
		System.out.println("[메서드 호출 후] num: " + num);
	}
//call by value :  값을 복사해서 넘겨줌
}
