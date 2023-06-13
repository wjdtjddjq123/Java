package chap06;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
			
		FloatToInteger fti = new FloatToInteger();
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("하나의 실수를 입력하세요: ");
		num = sc.nextDouble();
		sc.close();
		
		fti.setNum(num);

		System.out.println("버림: " + fti.floor());
		System.out.println("반올림: " + fti.round());
		System.out.println("올림: " + fti.ceil());
	}
}
		
		/*
			FloatToInteger exam1 = new FloatToInteger();
			double num;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("하나의 실수를 입력하세요: ");
	
			num = sc.nextDouble();
			sc.close();
			
			//exam1.burimNum(num);
			//exam1.bolimNum(num);
			//exam1.olimNum(num);

			System.out.printf("버림: %d\n반올림: %d\n올림: %d" ,(int)exam1.burimNum(num);, (int)exam1.bolimNum(num);,(int)exam1.olimNum(num););
		}
	}
			*/