package chap04;

import java.util.Scanner;
/*
* 아래의 가위바위보 코드를 이용하여 이길 때 까지 가위바위보 게임을 구현하는 코드를 작성하세요.

 */
public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String intro =("\n\t [ 가위바위보 게임 ]"
				+ "\n\t 1. 가위\n\t "
				+ "2. 바위\n\t "
				+ "3. 보\n\t"
				+ " >>>");
		
		String userStr="",comStr="", result="", input="";

		int user,com;		
		while(true){
			com = (int)(Math.random()*3);
			
			
			System.out.print(intro);
			user = sc.nextInt()-1; // 입력받음
			
			// 유저변환
			switch(user) {
			case 0:			userStr = "가위";		break;
			case 1:			userStr = "바위";		break;
			case 2:			userStr = "보";			break;
			}
			// 컴퓨터 변환
			switch(com) {
			case 0:			comStr = "가위";			break;
			case 1:			comStr = "바위";			break;
			case 2:			comStr = "보";			break;
			}
			
			switch(user - com) {
			case  0:		  result  = "비겼습니다."; 	break;
			case  1: case -2: result  = "이겼습니다.";   break;
			case -1: case  2: result  = "  졌습니다."; 	break;
			}
			
			System.out.printf("\n\t 사용자 : %s, 컴퓨터: %s \n", userStr,comStr);
			System.out.printf("\t 가위바위보 결과 ==> %s",result)	;
			
			sc.nextLine(); // 버퍼 초기화
			System.out.print("\n\t 종료하시려면 'q'를 입력하세요 :");
			
			input =sc.nextLine();
			
			if(input.length() == 1 && input.charAt(0)=='q' || input.charAt(0)=='Q') { 
				// 입력한 문자가 하나일 때만 ||  CharAt(문자열)  == q || Q 일 때 종료
				break;
			}
		} 
		sc.close();
		System.out.print("\n \t 이용해주셔서 감사합니다... 다음에 다시 만나요 ... ");
	}
}


//Scanner sc = new Scanner(System.in);
//String input;
//
//System.out.print("문자열을 입력하세요:");
//input = sc.nextLine();

//System.out.println("");
//sc.close();
//for(int i =0 ; i< input.length(); i++) {
//	System.out.println(input.charAt(i));			