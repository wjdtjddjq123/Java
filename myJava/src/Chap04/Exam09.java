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
public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t [ ���������� ���� ]\n\t 1. ����\n\t 2. ����\n\t 3. ��\n\t >>>");
		
		int user,com;
		
		user = sc.nextInt()-1;
		sc.close();
		
		com = (int)(Math.random()*3);
		
		String userStr="",comStr="", result=" ";
		
		switch(user) {
		case 0:			userStr = "����";		break;
		case 1:			userStr = "����";		break;
		case 2:			userStr = "��";			break;
		}

		

		switch(com) {
		case 0:			comStr = "����";			break;
		case 1:			comStr = "����";			break;
		case 2:			comStr = "��";			break;
		}
		
		switch(user - com) {
		case 0:			result = "�����ϴ�."; 	break;
		case 1: case-2: result = "�̰���ϴ�.";  break;
		case -1: case 2: result ="�����ϴ�." ; 	break; 
			
		}
		System.out.printf("\n\t ����� : %s, ��ǻ��: %s \n", userStr,comStr);
		System.out.printf("\t ���������� ��� ==> %s",result);
		
		
	}

}
