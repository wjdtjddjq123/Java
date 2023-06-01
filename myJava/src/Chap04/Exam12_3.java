package chap04;
/*
 * 1 부터 100 사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하세요.
 * [ 실행 예 ]
 * 		2	3	5	7	11
 * 	   13  17  19 ....
	약수 ? 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수
	소수 ? 1과 자기 자신을 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수를 가지는 수
	step 3 ] 2부터 100 사이의 소수를 구하여 출력하세요.
	
 */

public class Exam12_3 {

	public static void main(String[] args) {
		boolean isprime;
//		불린타입 선언
		for (int i=2; i<=100; i++) {
			isprime = true; 
			// 참일 때
			for (int j=2; j<=i/2; j++) {
				if( i % j == 0) {
					isprime = false;
					break;
//			 i가 참일 때 실행한 반복문에서 약수를 추출하지 못 하면 prime은 ture, 추출한다면 false 
				}
			}
			if (isprime) {
				System.out.print(i+"  ");
			}
		}
	}
}
