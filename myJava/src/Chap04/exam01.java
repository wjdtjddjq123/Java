package Chap04;

/*
 시험 점수는 0점부터 100점 사이의 값이어야 합니다.
 올바른 값이 입력되는 경우에만 학생의 점수를 평가하는 코드를 작성하세요. 
 

*/
import java.util.Scanner;
public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");		
			
		int score = sc.nextInt();
		sc.close();
		
		if ( score >= 101 && score >= 1) {
		}else if (score >= 94) {
			System.out.print("A.");
		} else if (score >= 90) {	
			System.out.print("A-");
		} else if (score >= 88) {	
			System.out.print("B+");
		} else if (score >= 84) {	
			System.out.print("B-");
		} else if (score >= 80) {	
			System.out.print("B");
		} else if (score >= 1) {	
			System.out.print("C, 재수강 대상입니다.");
		} else{
			System.out.print("점수가 잘 못 되었습니다. ");
		}
			
//			 if (score >= 98) {
//				System.out.printf("A+.", score);
//			} else if (score >= 94) {
//					System.out.print("A.");
//			} else if (score >= 90) {	
//					System.out.print("A-");
//			} else if (score >= 88) {	
//					System.out.print("B+");
//			} else if (score >= 84) {	
//					System.out.print("B-");
//			} else if (score >= 80) {	
//					System.out.print("B");
//			} else if (score >= 1) {	
//					System.out.print("C, 재수강 대상입니다.");
//			} else{
//					System.out.print("점수가 잘 못 되었습니다. ");
//				}	
//			}
		  	
		
	}	
}