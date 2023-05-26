package Chap03;
import java.util.Scanner; // scanner import
/*
 *  예제1) 사용자에게 영어와 수학 점수를 입력받아 두 과목 모두 80점 이상이면 "합격입니다.", 아니면"불합격입니다" 값을 출력하는 코드를 작성하세요.
 *  예제2) 사용자에게 영어와 수학 점수를 입력받아 두 과목 중 한 과목이라도 80점 미만인 점수가 있으면 "과락인 과목이 존재합입니다.", 아니면 "과락인 과목이 없습니다." 값을 출력하는 코드를 작성하세요.
 *  예제3) 사용자에게 영어와 수학 점수를 입력받아 두 과목 모두 80점 이상이면 True, 아니면 False 값을 출력하는 코드를 작성하세요.
 * */


public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int math, eng;
		boolean result;
		
		System.out.print("수학, 영어 점수를 입력하세요.");
		
		eng = input.nextInt();
		math = input.nextInt();
		

		result = eng > 80 || math > 80;
		System.out.println("수학/영어 두 과목 중 80점 이상]"+!result);
		

		input.close();
	}

}
