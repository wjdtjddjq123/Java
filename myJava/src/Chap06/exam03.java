package Chap06;
import java.util.Scanner;
/*
앞에서 작성한 가위바위보 객체를 이용하여 사용자가 원할 때 까지
가위바위보를 할 수 있는 코드를 작성하세요.
 */
public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보입력하세요");
		String input;
		RPS_2 rps = new RPS_2();
		
		while(true) {
			rps.setCom();
			String intro = "가위바위보 게임";
			rps.setUser(sc.nextInt());
			
			System.out.printf("\n\t 사용자: %s, 컴퓨터 %s \n",rps.getUser(),rps.getCom());
			System.out.printf("\t  가위바위보 결과 ==> %s\n",rps.judge());
			
			sc.nextLine();
			System.out.print(" 종료하시려면 q를 입력하세요");
			input=sc.nextLine();
			if(input.length() == 1 && (input.charAt(0)=='q'|| input.charAt(0)=='Q')) {
				break;
			}

		}
		sc.close();	
		System.out.print("끝");
	}		
}
