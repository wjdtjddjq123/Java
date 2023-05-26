package Chap04;
import java.util.Scanner;


/* 사용자에게 년도를 입력 받아 윤년 여부를 판단하여 출력하는 코드를 작성하세요.
[ 실행결과 1 ]           					[ 실행결과 2 ]
년도와 월을 입력하세요 : 2023 1			년도와 월을 입력하세요 : 2020 2
2020년 2월의 마지막 일자는 29일 입니다.		입력하신 연도의 마지막 일자는 29일입니다.

[ 윤년판단 알고리즘 ]

1. 큰달 : 1,3,5,7,8,10,12 => 31일
2. 작은달 : 4,6,9,11 => 30일
3. 2월 : 윤년 => 29일, 평년 => 28일

========================================================
[ 코드 작성 조건 ]
1. If ... else If ... else 구문을 이용하여 문제를 해결하세요.
2. If ... else 구문을 이용하여  문제를 해결하세요.

*/
public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요.");
		int year = sc.nextInt();
		System.out.print("월를 입력하세요.");
		int month = sc.nextInt();
		int day;
		sc.close();
		
		if ( year % 4 == 0 && year % 100 !=0 || year % 400 == 0  ) {
			switch(month) {
			case 2: 
			day = 29;
			System.out.printf("입력하신 년도는 윤년입니다.", year, day );
			break;
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.printf("입력하신 년도는 %d년 윤년입니다. %일 입니다.", year, day );
			break;
			
			case 4: case 6: case 9: case 11:
			day = 30;
			System.out.printf("입력하신 년도는 %d년 윤년입니다. %일 입니다.", year, day );
			break;
			}
			
		}else {
			switch(month) {
			case 2: 
			day = 28;
			System.out.printf("입력하신 년도는 %d년 평년 %d일 입니다.", year, day );
			break;
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			System.out.printf("입력하신 년도는 %d년 평년입니다. %일 입니다.", year, day );
			break;
			
			case 4: case 6: case 9: case 11:
			day = 30;
			System.out.printf("입력하신 년도는 %d년 평년입니다. %일 입니다.", year, day );
			break;
			}
		}
		
		
		}

	}



//switch(month) {
//case 2:
//	 {
//		
//	}
//day = 31;
//
//break;
//case 1:			case 3:			case 5:			case 7:
//case 10:		case 12:
//day = 31;
//
//System.out.printf("입력하신 연도는 %d", year, day,"입니다.");
//break;	