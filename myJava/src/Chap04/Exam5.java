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
public class Exam5 {

	public static void main(String[] args) {
		
		int  user;
		int com;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf(" 1. 가위\n 2. 바위\n 3. 보\n >>>>");
		
		String tmp=sc.nextLine();
	    user = Integer.parseInt(tmp);
		
		com = (int)(Math.random() * 3) + 1;  // 1.가위,2.바위,3.보
		String tmp1 = Integer.toString(com);
		
		switch(user-com) {
		 case -2:
		 case 1:
		  System.out.printf("사용자: %d, 컴퓨터 %d \n 가위바위보 결과 ==> 이겼습니다",tmp,com);
		  break;
		 case -1:
		 case  2:
			 System.out.printf("사용자: %d, 컴퓨터 %d \n 가위바위보 결과 ==> 졌습니다",tmp,com);
			 break;
		 case 0:
			 System.out.printf("사용자: %d, 컴퓨터 %d \n 가위바위보 결과 ==> 비겼습니다.",tmp,com);
			 break;
		}
					

	}

}
