package Chap04;
import java.util.Scanner;
public class exam02 {
	public static void main(String[] args) {
		/*
		  사용자에게 하나의 실수를 입력받아 다음의 결과를 출력하는 코드를 작성하세요.
		 
		  실행결과 1]
		  하나의 실수를 입력하세요. : 3.65
		  버림 : 3
		  반올림 : 4
		  올림 : 4
		  ========================================
		  실행결과 2]
		  하나의 실수를 입력하세요. : 6.2364
		  버림 : 6
		  반올림 : 6
		  올림 : 7
		  ========================================
		  실행결과 3]
		  하나의 실수를 입력하세요. : 4.0
		  버림 : 4
		  반올림 : 4
		  올림 : 4
		  
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t하나의 실수를 입력하세요:");
				
		
		double num = sc.nextDouble();
		
		sc.close();
		
		System.out.println("\t\n버림: " + (int) num );
		System.out.println("\n반올림 : " + (int)(num + 0.5));
		
		if (num == (int)num) {
			System.out.print("\n올림: "+ (int)num );
		} else {
			System.out.print("\n올림: "+ (int)(num+1));
		}
//		소수점 자리의 수는 int로 타입 변환 시 소수점 수는 버려짐 그래서 1을 추가해 올림
		
//		if (num != (int)num) {
//			System.out.print("\n올림"+(int)num);
//		} else {
//			System.out.print("\n올림"+(int)(num + 1));
//		}

//		
//		System.out.println("\t\n버림: " + (int) num );
//		System.out.println("\n반올림 : " + (int)(num + 0.5));	
//		System.out.println("\n올림 : "  + (int)(num + 0.8));
//	
	}

}
