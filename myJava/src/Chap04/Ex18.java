package chap04;
/*
 * 1부터 100 사이의 짝수의 합을 구하는 코드를 작성하세요. 
 * 단, continue를 사용합니다. 
 * 
 * */
public class Ex18 {
	public static void main(String[] args) {
		int total =0;
		int i = 0 ;

		while( i <= 100 ) {
			i++; 
			// continue 건너 뛰면 조건식으로 가기 때문에 여기서 증감시켜라
			
			if( i % 2 != 0 ) {
			// i가 홀수이면 건너 뛰어라 
			
				continue;
			// 이 문장이후 미지수를 변경하는 코드를 앞쪽으로 변경해라.
			// 건너 뛰면 조건식으로 가라 그 다음 증감식으로 가라
			}
			total += i;
		
		}
		System.out.println("total:"+total);
	}
}

