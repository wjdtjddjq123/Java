package Chap03;
import java.util.Scanner;
public class Exam_1 {
	public static void main(String[] args) {
		/*
		  사용자에게 하나의 실수를 입력받아 다음의 결과를 출력하는 코드를 작성하세요.
		 
		  실행결과 1]
		  하나의 실수를 입력하세요. : 3.65
		  버림 : 3
		  반올림 : 4
		  ========================================
		  실행결과 2]
		  하나의 실수를 입력하세요. : 6.2364
		  버림 : 6
		  반올림 : 6
		  */
		Scanner input = new Scanner(System.in);
		System.out.print("\n\t하나의 실수를 입력하세요:");
				
		
		double num = input.nextDouble();

		input.close();
		
		System.out.println("\t\n버림: " + (int) num );
		System.out.println("\n반올림 : " + (int)(num + 0.5));	
	
	}

}
