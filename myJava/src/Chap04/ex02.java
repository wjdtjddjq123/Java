package Chap04;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");		
			
		int score = sc.nextInt();
		
		sc.close();
	
		if (score >= 70) {
			System.out.print("합격입니다.");
			System.out.print("축하합니다~!");
		} else {
			System.out.print("불합격입니다.");		
			System.out.print("다음에다시도전해주세요.");
		}	
	}

}
