package chap04;

import java.util.Scanner;
/*
* �Ʒ��� ���������� �ڵ带 �̿��Ͽ� �̱� �� ���� ���������� ������ �����ϴ� �ڵ带 �ۼ��ϼ���.

 */
public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String intro =("\n\t [ ���������� ���� ]"
				+ "\n\t 1. ����\n\t "
				+ "2. ����\n\t "
				+ "3. ��\n\t"
				+ " >>>");
		
		String userStr="",comStr="", result="", input="";

		int user,com;		
		while(true){
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
			case  1: case -2: result  = "�̰���ϴ�.";   break;
			case -1: case  2: result  = "  �����ϴ�."; 	break;
			}
			
			System.out.printf("\n\t ����� : %s, ��ǻ��: %s \n", userStr,comStr);
			System.out.printf("\t ���������� ��� ==> %s",result)	;
			
			sc.nextLine(); // ���� �ʱ�ȭ
			System.out.print("\n\t �����Ͻ÷��� 'q'�� �Է��ϼ��� :");
			
			input =sc.nextLine();
			
			if(input.length() == 1 && input.charAt(0)=='q' || input.charAt(0)=='Q') { 
				// �Է��� ���ڰ� �ϳ��� ���� ||  CharAt(���ڿ�)  == q || Q �� �� ����
				break;
			}
		} 
		sc.close();
		System.out.print("\n \t �̿����ּż� �����մϴ�... ������ �ٽ� ������ ... ");
	}
}


//Scanner sc = new Scanner(System.in);
//String input;
//
//System.out.print("���ڿ��� �Է��ϼ���:");
//input = sc.nextLine();

//System.out.println("");
//sc.close();
//for(int i =0 ; i< input.length(); i++) {
//	System.out.println(input.charAt(i));			