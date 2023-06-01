package chap04;
/*
 * 1 부터 100 사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하세요.
 * [ 실행 예 ]
 * 		2	3	5	7	11
 * 	   13  17  19 ....
	약수 ? 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수
	소수 ? 1과 자기 자신을 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수를 가지는 수
	step 2 ] 2부터 20의 모든 수에대하여 1과 자신을 제외한 약수를 출력하세요.
 */

public class Exam12_2 {

	public static void main(String[] args) {

		for(int i=2; i<=20/2; i++) {
			System.out.printf("약수 %d \n", i);
			for(int j=2; j<=i/2; j++) {
				if(i%j == 0) {
					System.out.printf("약수 %d \t", j);
				}
			}
		}
	}
}
