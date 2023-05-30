package chap04;
import java.util.Scanner; // 스캐너 임포트 
/*

	2단 부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.
	단, 하나의 for 반복문을 사용합니다.
	[ 실행 예 ]
	
	
  	2 * 1 =  2
  	2 * 2 =  4
  	2 * 3 =  6
  	...
  	2 * 9 = 18
  	...
  	3 * 1 =  3
  	...
  	9 * 9 =  
  
*/
public class gugudan2 {

	public static void main(String[] args) {

	int dan = 2, num =1; 
	for(int i=0; i<72; i++) {
		System.out.printf("%d * %d = %d", dan, num, dan*num);
		num++;
		
		if(num==10) { // num이 10 넘어간다면
			dan ++;   // dan 1증가
			num = 1;  // num 1으로 
		}
		}
	}
}


