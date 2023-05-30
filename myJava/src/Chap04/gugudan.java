package chap04;
import java.util.Scanner; // 스캐너 임포트 
/*
  사용자에게 구구단의 단을 입력받아 구구단 결과를 출력하는 코드를 작성하세요.
  실행 예]
  
  구구단의 단을 입력하세요.
  
  [ 4단 ]
  4 * 1 =  4
  4 * 2 =  8
  4 * 3 = 12
  ...
  4 * 9 = 36
  
*/
public class gugudan {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("구구단의 단을 입력하세요:");
//		
//		int dan = sc.nextInt();
//		
//		System.out.printf("[ %d 단 ] \n",dan);
//		for(int i=1; i<=9; i++) 
//			{
//			System.out.printf("%d * %d = %2d \n", dan, i, i*dan);
//			}
	
	Scanner sc = new Scanner(System.in); 	 // 스캐너 사용
	System.out.print("구구단의 단을 입력하세요:"); // 
	
	int dan = sc.nextInt(); 	// 스캐너 모듈 이용해서 키보드로 입력받은 변수 초기화
	
	System.out.printf("[ %d 단 ] \n",dan); // 변수 사용 

	sc.close(); // 스캐너 종료
	for(int i=1; i<=9; i++){ // for문, i는 1; i는 9이하; i는 1씩 증가 
		System.out.printf("%d * %d = %2d \n", dan, i, i*dan);
		// 첫번째 %d = dan, 두번째 %d = i, 세번째 %2d = i*dan ( 두번째 자리까지 만 출력 없는 영역은 공백 )
		}
	}	
}


