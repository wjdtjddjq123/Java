package chap04;

/* 아래의 중펍 for 반복문을 중첩 do while 반복문으로 반환하는 코드를 작성하세요. */


public class Ex14 {


	public static void main(String[] args) {
		int num = 0;
		do {
			num++;
		}while(num <= 9);{
			int dan = 2;
			while(dan <=9);{
				if( num == 0 ) {
					System.out.printf(" [ %d 단 ] \t ",  dan );
					} else {
					System.out.printf(" %d * %d = %d \t ", num , dan , num*dan );
					}
					dan++;
			}System.out.println("");
		}
	}	
}


//int total = 0;
//for (int i =1; i<=100; i++) {
//	total += i;
//}
//System.out.printf("%d", total);
//
//int i =1; // 변수 초기화
//
//do {
//	total += i;
//	i++; // 증감식, 반복문
//	
	// 증감식이 없을 시 무한루프
	// 조건이 거짓이어야만 루프종료
//}while ( i<=100 ); // 조건식
//System.out.printf("1부터 100까지의 합: %d", total);