package Chap03;

public class Ex03 {
	public static void main(String[] args) {
		
		byte b1 =10, b2 =20, result;
	
		result = (byte)(b1 + b2); // 덧셈연산을 수행하느 순간 b1,b2의 값이 int로 바뀜 int로 덧셈 수행 Intpromotion
		// 연산을 사용할 때는 4byte 단위로 연산을 할 수 있게 하는 것이
		System.out.print(result);
	}

}
