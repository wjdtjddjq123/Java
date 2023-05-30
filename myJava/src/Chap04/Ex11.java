package chap04;


public class Ex11 {

	public static void main(String[] args) {		
		int total = 0;
//		for (int i =1; i<=100; i++) {
//			total += i;
//		}
//		System.out.printf("%d", total);
		
		int i =1; // 변수 초기화
		
		while ( i<=100 ) { // 조건식 
			total += i;
			i++; // 증감식, 반복문
			// 증감식이 없을 시 무한루프
			// 조건이 거짓이어야만 루프종료
		}
		System.out.printf("1부터 100까지의 합: %d", total);
	}
}
