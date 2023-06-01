package chap04;
/*
 * 1부터 100 까지의 합은 5050입니다. 그렇다면 1부터 몇 까지의 합이 최초로 1000을 초과하는 값일까요?
 * 그 결과를 계산하는 코드를 작성하세요. 
 * 
 * 실행 예 ]
 * 1부터 ?까지의 합은 ?입니다.
 * 
 * */
public class Ex19 {
	public static void main(String[] args) {
		int num =0;
		int i = 0 ;
		
		while( num <= 1000 ) {
		
			if(num>1000) {
				break;
			}
			i++;
		
		
//	 	증가식 계산은 상황, 조건에 따라서 얼마든지 위치가 바뀔 수 있다.
//		
		num += i;
		
	}
	System.out.printf("1부터 %d까지의 합은 %d 입니다.",i,num);
	}
}

