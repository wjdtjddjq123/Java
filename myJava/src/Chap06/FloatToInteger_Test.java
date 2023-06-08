package Chap06;
import java.util.Scanner;

public class FloatToInteger_Test {
	public static void main(String[] args) {
		
		FloatToInteger fti = new FloatToInteger();
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.print("하나의 실수 값을 입력하세요:");
		num = sc.nextDouble();
		
		sc.close();
		
		fti.setNum(num);
		System.out.println("버림: "+fti.floor());
		System.out.println("반올림: "+fti.round());
		System.out.println("올림: "+fti.ceil());
		
		
	}
}
