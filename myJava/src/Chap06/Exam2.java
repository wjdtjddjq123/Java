package chap06;


/* 	아래의 가위바위보 게임의 코드를 배열을 이용하여 객체지향 기법을 적용한 코드로 변환하여 작성하세요.
  	사용자 가위바위보 객체, 컴 가위바위보객체, 비교메서드, 결과창
 */

import java.util.Scanner;
public class Exam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Kbb kbb;
		String intro = "\n\t[ 가위바위보 게임 ] \n"
				+ "\n"
				+ "\t 1. 가위 \n"
				+ "\t 2. 바위 \n"
				+ "\t 3. 보 \n"
				+ "\t >>> ";
		
		System.out.print(intro);
		kbb = new Kbb(sc.nextInt());
		sc.close();
		
		System.out.printf("\t\n사용자: %s, 컴퓨터: %s" , kbb.getUser(), kbb.getCom());
		System.out.printf("결과 ===> %s\n" , kbb.judge());
	}
	} 
