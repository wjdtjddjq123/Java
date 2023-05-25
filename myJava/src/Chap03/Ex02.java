package Chap03;

public class Ex02 {
	public static void main(String[] args) {
		int num1 = 7, num2 = 4, result;
		result = 7 + (~num2 + 1);
		System.out.printf("%d + %d = %d \n", num1,num2,result);
	}

}

/*
 *  실수가 비트연산의 대상이 될 수 없는 이유 : 정수는 실제 값을 저장 실수의 데이터는 부호비트, 가수, 지수부로 이루어져있기때문
 * */
