package chap06;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
			
		FloatToInteger fti = new FloatToInteger();
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ���: ");
		num = sc.nextDouble();
		sc.close();
		
		fti.setNum(num);

		System.out.println("����: " + fti.floor());
		System.out.println("�ݿø�: " + fti.round());
		System.out.println("�ø�: " + fti.ceil());
	}
}
		
		/*
			FloatToInteger exam1 = new FloatToInteger();
			double num;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("�ϳ��� �Ǽ��� �Է��ϼ���: ");
	
			num = sc.nextDouble();
			sc.close();
			
			//exam1.burimNum(num);
			//exam1.bolimNum(num);
			//exam1.olimNum(num);

			System.out.printf("����: %d\n�ݿø�: %d\n�ø�: %d" ,(int)exam1.burimNum(num);, (int)exam1.bolimNum(num);,(int)exam1.olimNum(num););
		}
	}
			*/