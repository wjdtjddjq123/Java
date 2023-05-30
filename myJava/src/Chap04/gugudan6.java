package chap04;
/*

	2단 부터 9단 까지의 전체 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요.
	단, 중첩 for 반복문을 사용합니다.
  
*/
public class gugudan6 {

	public static void main(String[] args) {
//		for(int i = 1; i <= 9; i++) {
//			// 줄을 구분하는 for문, 수가 바뀜
//				System.out.print("\n");
//			for (int j = 2; j<=9; j++) {
//			// 곱하는 줄를 구분하는 for문 
//				System.out.printf(" %d * %d = %d \t ", j , i , i*j );
//			}
//		}
		for (int num = 1; num <=9; num++) {
			for(int dan = 2; dan <=9; dan++) {
				System.out.printf(" %d * %d = %d \t ", dan , num , dan*num );
			}
			System.out.println();
		}
	}
}