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
public class Exam5 {

	public static void main(String[] args) {
		
		int  user;
		int com;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf(" 1. ����\n 2. ����\n 3. ��\n >>>>");
		
		String tmp=sc.nextLine();
	    user = Integer.parseInt(tmp);
		
		com = (int)(Math.random() * 3) + 1;  // 1.����,2.����,3.��
		String tmp1 = Integer.toString(com);
		
		switch(user-com) {
		 case -2:
		 case 1:
		  System.out.printf("�����: %d, ��ǻ�� %d \n ���������� ��� ==> �̰���ϴ�",tmp,com);
		  break;
		 case -1:
		 case  2:
			 System.out.printf("�����: %d, ��ǻ�� %d \n ���������� ��� ==> �����ϴ�",tmp,com);
			 break;
		 case 0:
			 System.out.printf("�����: %d, ��ǻ�� %d \n ���������� ��� ==> �����ϴ�.",tmp,com);
			 break;
		}
					

	}

}
