package Chap03;
/*
Chpater3 - 연산자 (Operator)
	
     1) 단항, 매입 연산자는 우에서 좌로 계산
	 2) 우선순위가 같은 연산자 함께 사용 되어질 때는 연산의 방향에 따라 연산 순서가 결정 된다. 
	 3) "문자열"+"문자열" = 문자열 연산자 피연산자의종류, 연산의 수에따라 달라진다.	
	 	"Apple" - "Tree" -> 컴파일 오류
	 4) 부호연산자 +4 
	 5) 서로다른 피연산자에 대한 연산은 안 됨, 값을 읽고 사용하는 방식 자체가 틀리기 때문에 연산이 안 된다.
	 6) 그러나 크기가 작은 쪽에서 큰 쪽으로의 연산은 가능.

*/
public class Ex01 {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 5; num2 = 2 ;
		
		result = num1 + num2;
		System.out.println("reslut:"+result);

		result = num1 - num2;
		System.out.println("reslut:"+result);
		
		result = num1 * num2;
		System.out.println("reslut:"+result);
		
		result = num1 / num2;
		System.out.println("reslut:"+result);
		System.out.println("reslut:"+(double)5/2);
		// Java에서 정수와 실수의 나눗셈의 결과는 정수이다. 
		
	}
	
}
