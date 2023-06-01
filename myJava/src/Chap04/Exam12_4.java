package chap04;
/*
 * 1 부터 100 사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하세요.
 * [ 실행 예 ]
 * 		2	3	5	7	11
 * 	   13  17  19 ....
	약수 ? 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수
	소수 ? 1과 자기 자신을 어떤 수를 나누었을 때 나누어떨어지게 하는 자연수를 가지는 수
 */

public class Exam12_4 {

	public static void main(String[] args) {
		
		boolean prime;
		int count=0;
		
		for(int i =2; i<=100; i++) {
			prime = true;
			for(int j=2; j<=i/2;j++) {
				if( i%j==0) {
					prime =false;
					break;
				}
			}
			if(prime) {
				count ++;
				System.out.printf("%3d",i);
				
				if( count % 5 == 0) {
					System.out.println("");
				}
			}
		}
		
		
	}
}
