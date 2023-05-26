package Chap04;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");		
			
		int score = sc.nextInt();
		
		sc.close();
	
		if (score >= 90) {
			System.out.print("참 잘했습니다.");
		} else {
			if (score >= 80) {
				System.out.print("잘했습니다.");
			}
			else {
				if (score >= 70) {
					System.out.print("보통입니다.");
				}else {
					if (score >= 60) {
						System.out.print("좀 더 노력하세요.");
					}else {
						System.out.print("재수강 대상입니다.");
					}
				}
			}
		}
	}
}
