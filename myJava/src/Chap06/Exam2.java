package chap06;


/* 	�Ʒ��� ���������� ������ �ڵ带 �迭�� �̿��Ͽ� ��ü���� ����� ������ �ڵ�� ��ȯ�Ͽ� �ۼ��ϼ���.
  	����� ���������� ��ü, �� ������������ü, �񱳸޼���, ���â
 */

import java.util.Scanner;
public class Exam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Kbb kbb;
		String intro = "\n\t[ ���������� ���� ] \n"
				+ "\n"
				+ "\t 1. ���� \n"
				+ "\t 2. ���� \n"
				+ "\t 3. �� \n"
				+ "\t >>> ";
		
		System.out.print(intro);
		kbb = new Kbb(sc.nextInt());
		sc.close();
		
		System.out.printf("\t\n�����: %s, ��ǻ��: %s" , kbb.getUser(), kbb.getCom());
		System.out.printf("��� ===> %s\n" , kbb.judge());
	}
	} 
