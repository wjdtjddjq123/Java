package chap04;

import java.util.Scanner;
/*
 * 아래의 가위바위보 코드를 이용하여 이길 때 까지 가위바위보 게임을 구현하는 코드를 작성하세요. 
 1.가위
 2.바위
 3. 보
 입력하세요:   3
 
 사용자 보, 컴퓨터 가위
 가위바위보 결과 -- 졌습니다.
 
 [코드 작성 조건]
 1.switch문 이용하여 문제를 해결하세요.
 2.if문을 이용하여 문제를 해결하세요.
 */
public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String intro =("\n\t [ 가위바위보 게임 ]"
				+ "\n\t 1. 가위\n\t "
				+ "2. 바위\n\t "
				+ "3. 보\n\t"
				+ " >>>");
		
		String userStr="",comStr="", result="";
		
		int user,com;
		
		boolean iswin = false;
		
		
		do {
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
			case  1: case -2: result  = "이겼습니다."; iswin = true ;  break;
			case -1: case  2: result  = "졌습니다." ; 	break;
			}
			
			System.out.printf("\n\t 사용자 : %s, 컴퓨터: %s \n", userStr,comStr);
			System.out.printf("\t 가위바위보 결과 ==> %s",result);
			
		}while(!iswin);
		sc.close();
		System.out.print("\n \t 이용해주셔서 감사합니다... 다음에 다시 만나요 ... ");
	}
}
		
		
		
		
		
		
		
		
		
		
		

//		switch(user) {
//		case 0:			userStr = "가위";		break;
//		case 1:			userStr = "바위";		break;
//		case 2:			userStr = "보";			break;
//		}
//
//		switch(com) {
//		case 0:			comStr = "가위";			break;
//		case 1:			comStr = "바위";			break;
//		case 2:			comStr = "보";			break;
//		}
//		
//		switch(user - com) {
//		case 0:			result  = "비겼습니다."; 	break;
//		case 1:  case-2: result = "이겼습니다.";  break;
//		case -1: case 2: result ="졌습니다." ; 	break; 
//			
//		}


