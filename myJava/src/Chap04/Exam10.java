package chap04;

import java.util.Scanner;
/*
 * �Ʒ��� ���������� �ڵ带 �̿��Ͽ� �̱� �� ���� ���������� ������ �����ϴ� �ڵ带 �ۼ��ϼ���. 
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
public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String intro =("\n\t [ ���������� ���� ]"
				+ "\n\t 1. ����\n\t "
				+ "2. ����\n\t "
				+ "3. ��\n\t"
				+ " >>>");
		
		String userStr="",comStr="", result="";
		
		int user,com;
		
		boolean iswin = false;
		
		
		do {
			com = (int)(Math.random()*3);
			
			
			System.out.print(intro);
			user = sc.nextInt()-1; // �Է¹���
			
			// ������ȯ
			switch(user) {
			case 0:			userStr = "����";		break;
			case 1:			userStr = "����";		break;
			case 2:			userStr = "��";			break;
			}
			// ��ǻ�� ��ȯ
			switch(com) {
			case 0:			comStr = "����";			break;
			case 1:			comStr = "����";			break;
			case 2:			comStr = "��";			break;
			}
			
			switch(user - com) {
			case  0:		  result  = "�����ϴ�."; 	break;
			case  1: case -2: result  = "�̰���ϴ�."; iswin = true ;  break;
			case -1: case  2: result  = "�����ϴ�." ; 	break;
			}
			
			System.out.printf("\n\t ����� : %s, ��ǻ��: %s \n", userStr,comStr);
			System.out.printf("\t ���������� ��� ==> %s",result);
			
		}while(!iswin);
		sc.close();
		System.out.print("\n \t �̿����ּż� �����մϴ�... ������ �ٽ� ������ ... ");
	}
}
		
		
		
		
		
		
		
		
		
		
		

//		switch(user) {
//		case 0:			userStr = "����";		break;
//		case 1:			userStr = "����";		break;
//		case 2:			userStr = "��";			break;
//		}
//
//		switch(com) {
//		case 0:			comStr = "����";			break;
//		case 1:			comStr = "����";			break;
//		case 2:			comStr = "��";			break;
//		}
//		
//		switch(user - com) {
//		case 0:			result  = "�����ϴ�."; 	break;
//		case 1:  case-2: result = "�̰���ϴ�.";  break;
//		case -1: case 2: result ="�����ϴ�." ; 	break; 
//			
//		}


