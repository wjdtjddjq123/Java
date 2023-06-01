package chap04;

/* 
 * 1부터 100 까지의 합은 5050입니다. 그렇다면 1부터 몇 까지의 합이 최초로 1000을 초과하는 값일까요?
 * 그 결과를 계산하는 코드를 작성하세요
 * */


public class Ex15 {
	public static void main(String[] args) {
		int num = 0,i = 0;
		
//		while( num <= 1000 ) {
//			i++;
//			
////		 	증가식 계산은 상황, 조건에 따라서 얼마든지 위치가 바뀔 수 있다.
////			
//			num += i;
//			
//		}
//		System.out.printf("1부터 %d까지의 합은 %d 입니다.",i,num);

		
//		값 확인 루프
		for ( i = 0; i < 46; i++) {
//		반복수행하는 조건을 실행시키고 실행 
			num+=i;
		}
		System.out.printf("%d", num);
//		System.out.printf("1부터 %d까지의 합은 %d 입니다.", sum,i);
	}	
}

