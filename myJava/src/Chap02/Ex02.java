package Chap02;
import java.util.Scanner;


public class Ex02 {
	public static void main(String[] args) {
		String name;
		int math_score;
		Scanner sc = new Scanner(System.in);
		
		
		// 이름 입력받기
		System.out.print("이름을 입력하세요.");
		name = sc.next();
		
		// 수학점수 입력받기
		System.out.print("수학점수를 입력하세요.");	
		math_score = sc.nextInt();

/*		import > sc. > next... << 스캐너 키보드를 이용해 입력 받는 함수 
 * 
 * */
		System.out.print(name +"의 수학점수는 "+ math_score + "점 입니다.");
		sc.close();
		}
	}
