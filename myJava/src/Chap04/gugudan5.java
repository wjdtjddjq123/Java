package chap04;
/*

	2단 부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.
	단, 중첩 for 반복문을 사용합니다.
	[ 실행 예 ]
	
	[ 2단 ]
  	2 * 1 =  2
  	2 * 2 =  4
  	2 * 3 =  6
  	...
  	2 * 9 = 18
  	...
  	[ 3단 ]
  	3 * 1 =  3
  	...
  	9 * 9 = 81
  
*/
public class gugudan5 {

	public static void main(String[] args) {

		for( int i=0; i <= 9; i++) {
				System.out.printf("[ %d 단 ]\n", i);
			for (int j =1; j<=9; j++) {
				System.out.printf("%d * %d = %2d \n ", i, j, i*j);
			}
		}
	}
}

