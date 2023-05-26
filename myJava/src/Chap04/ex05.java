package Chap04;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");		
			
		int score = sc.nextInt();
		sc.close();

		if (score >= 98) {
			System.out.print("A+");	
		} else if (score >= 94) {
			System.out.print("A-");
		} else if (score >= 90) {
			System.out.print("A");
		} else if (score >= 88) {	
			System.out.print("B+");
		} else if (score >= 84) {	
			System.out.print("B-");
		} else if (score >= 80) {	
			System.out.print("B");
		} else {
			System.out.print("C");
		}	
	}	
}