package chap04;

import java.util.Scanner;
/*
 1.����
 2.����
 3. ��
 �Է��ϼ���:   3
 
 ����� ��, ��ǻ�� ����
 ���������� ��� -- �����ϴ�.
 
 [�ڵ� �ۼ� ����]
 1.switch�� �̿��Ͽ� ������ �ذ��ϼ���.
 2.if���� �̿��Ͽ� ������ �ذ��ϼ���.
 */
public class Exam08 {

	public static void main(String[] args) {
		
		int  user;
		int com;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf(" 1. ����\n 2. ����\n 3. ��\n >>>>");
		
		String tmp=sc.nextLine();
	    user = Integer.parseInt(tmp);
		
		com = (int)(Math.random() * 3) + 1;  // 1.����,2.����,3.��
		String tmp1 = Integer.toString(com);
		
		if (user == com) {
			System.out.print("���");
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
//			System.out.print("���");
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
//				System.out.print("���");
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
//				System.out.print("���");
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
