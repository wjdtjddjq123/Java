package chap04;
import java.util.Scanner; // 스캐너 임포트 
/*

	2단 부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.
	단, 하나의 for 반복문을 사용합니다.
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
  	9 * 9 =  
  
*/
public class gugudan3 {

	public static void main(String[] args) {

	
//	Scanner sc = new Scanner(System.in); 	 // 스캐너 사용
//	System.out.print("구구단의 단을 입력하세요:"); // 
//	
	int dan=2,num =1; 

//	sc.close(); // 스캐너 종료
	
//	for(int i=0; i<72; i++) { // i 는 72 까지 루프
//		if(num==1) {
//			System.out.printf("[ %d 단 ] ", dan);
//		}
//		System.out.printf("%d * %d = %2d \n", dan, num, dan*num);
//		num++;
//		if(num == 10) {
//			dan ++;
//			num = 1;
//			
//		}
//		}
	/* 
	
	권장되어지지 않는 이유
	하나의 반복문은 하나의 목적을 위해서만 사용해야함.
	아래 코드는 서로다른 두개 이상의 다양한 목적을 위해 사용하게 됨
	두 개 이상의 다른 목적을 위해 사용하게 되면, 어렵고 복잡해짐.
	
	반복문은 언제나 한 가지 목적만을 위해서 사용 되어야함.
	
	*/
	for(int i=0; i<72; i++) { 
	
	if(num == 1) {
		System.out.printf("\n[ %d 단 ] \n", dan);
	}
		System.out.printf("\n%d * %d = %2d", dan, num, dan*num);
		num++;
	
	if ( num == 10 ) {
		dan ++;
		num = 1;
			}
		}
	}
}

