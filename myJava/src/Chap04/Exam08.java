package chap04;

import java.util.Scanner;
/*
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
public class Exam08 {

	public static void main(String[] args) {
		
		int  user;
		int com;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf(" 1. 가위\n 2. 바위\n 3. 보\n >>>>");
		
		String tmp=sc.nextLine();
	    user = Integer.parseInt(tmp);
		
		com = (int)(Math.random() * 3) + 1;  // 1.가위,2.바위,3.보
		String tmp1 = Integer.toString(com);
		
		if (user == com) {
			System.out.print("비김");
		}else if(user > com) {
			System.out.print("lose");
		}else{
			System.out.print("win");
		}
//		
//		switch(com) {
//		case 1:
//			switch(user) {
//			case 1:
//			System.out.print("비김");
//			break;
//			
//			case 2:
//			System.out.print("lose");
//			break;
//			
//			case 3:
//			System.out.print("win");
//			break;
//			
//			default:
//			System.out.print("???");
//			
//			}
//		break;
//		case 2:
//			switch(user) {
//			case 1:
//				System.out.print("win");
//				break;
//				
//				case 2:
//				System.out.print("비김");
//				break;
//				
//				case 3:
//				System.out.print("lose");
//				break;	
//				
//				default:
//				System.out.print("???");	
//			}
//		break;
//		
//		case 3:
//			switch(user) {
//			case 1:
//				System.out.print("win");
//				break;
//				
//				case 2:
//				System.out.print("lose");
//				break;
//				
//				case 3:
//				System.out.print("비김");
//				break;	
//				
//				default:
//				System.out.print("???");	
//				
//			}
//		break;
//		default:
//		System.out.print("???");	
//		
//		}


	}

}
