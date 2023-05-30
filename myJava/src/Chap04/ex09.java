package chap04;


public class Ex09 {

	public static void main(String[] args) {		
//	1부터 100 사이의 값 중 홀수의 합과 짝수의 합을 동시에 구하여 그 결과를 
//	출력하는 코드를 작성하세요.
		int A = 0,B = 0, C=0;
//		for (int i =1;  i <= 100; i++) {
//			if ( i % 2 != 0 ) {
//				A+= i;
//			}
//			else {
//				B += i;
//			}
//		}
//		C =A+B;
//		System.out.print("\n A의 값:"+A);
//		System.out.print("\n B의 값:"+B);
//		System.out.printf("\n %d+%d = %d",A,B,C);
//		for (int i=1, j=1; i <= 100 && j <= 100; i++, j+=2 ) {
//			A += i;
//			B += j;
//			C = A+B;
//		}
//		System.out.printf("%d+%d=%d",A,B,C);
		
		for(int i =2, j=1; j<=100 && i<=100; i+=2, j+=2) {
			A += i;
			B += j;
		}
		System.out.println("1 부터 100의 사이 홀수의 합은"+A+"입니다.");
		System.out.println("1 부터 100의 사이 홀수의 합은"+B+"입니다.");
	}
}
