package Chap06;
import java.util.Scanner;

public class FloatToInteger_Test {
	public static void main(String[] args) {
		
		FloatToInteger fti = new FloatToInteger();
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.print("�ϳ��� �Ǽ� ���� �Է��ϼ���:");
		num = sc.nextDouble();
		
		sc.close();
		
		fti.setNum(num);
		System.out.println("����: "+fti.floor());
		System.out.println("�ݿø�: "+fti.round());
		System.out.println("�ø�: "+fti.ceil());
		
		
	}
}
