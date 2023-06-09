package Chap06;
import java.util.Scanner;
/*
아래 가위바위보 코드를 이용하여 객체지향 기법을 적용한 코드로 변환하여 작성하세요.
 */
public class exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보입력하세요");
		RPS_2 rps;
		
		String intro = "가위바위보 게임";
		rps = new RPS_2(sc.nextInt());
		
		System.out.printf("\n\t 사용자: %s, 컴퓨터 %s \n",rps.getUser(),rps.getCom());
		System.out.printf("\t  가위바위보 결과 ==> %s\n",rps.judge());
		
		
	}

}