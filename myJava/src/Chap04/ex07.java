package Chap04;
import java.util.Scanner;


/* 사용자에게 년도를 입력 받아 윤년 여부를 판단하여 출력하는 코드를 작성하세요.
[ 실행결과 1 ]           		[ 실행결과 2 ]
년도를 입력하세요 : 2023			년도를 입력하세요 : 2020
입력하신 년도는 평년입니다.		입력하신 년도는 윤년입니다.

[ 윤년판단 알고리즘 ]

1. 4의 배수인 해는 윤년입니다.
2. 100의 배수인 해는 평년입니다.
3. 400의 배수인 해는 윤년입니다. 
=> 2023: 평년, 2020: 윤년, 1900:평년, 2000: 윤년

========================================================
[ 코드 작성 조건 ]
1. If ... else If ... else 구문을 이용하여 문제를 해결하세요.
2. If ... else 구문을 이용하여  문제를 해결하세요.

*/
public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요.");
		int year = sc.nextInt();
		sc.close();
		
//		if ( year % 4 == 0 ) {
			// 4로 나누어질 때 조건문 이동
//			if(year % 400 == 0 || year % 100 !=0) {
		// 400으로 나누어지거나 100으로 안 나누어질 때
//				System.out.printf("윤년입니다.", year);
//			}else if( year % 100 == 0) {
		//
//				System.out.printf("평년입니다.", year);
//			}else {
//				System.out.print("평년입니다.");	
//			}	
//		}	else {
//			System.out.print("평년입니다.");
//		}
		
		if ( year % 4 == 0 && year % 100 !=0 || year % 400 == 0  ) {
			System.out.printf("윤년입니다.", year );
		}	else {
			System.out.print("평년입니다.");
		}
		
		

	}
}