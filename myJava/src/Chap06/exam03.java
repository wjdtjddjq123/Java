package Chap06;
import java.util.Scanner;
/*
�տ��� �ۼ��� ���������� ��ü�� �̿��Ͽ� ����ڰ� ���� �� ����
������������ �� �� �ִ� �ڵ带 �ۼ��ϼ���.
 */
public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����������Է��ϼ���");
		String input;
		RPS_2 rps = new RPS_2();
		
		while(true) {
			rps.setCom();
			String intro = "���������� ����";
			rps.setUser(sc.nextInt());
			
			System.out.printf("\n\t �����: %s, ��ǻ�� %s \n",rps.getUser(),rps.getCom());
			System.out.printf("\t  ���������� ��� ==> %s\n",rps.judge());
			
			sc.nextLine();
			System.out.print(" �����Ͻ÷��� q�� �Է��ϼ���");
			input=sc.nextLine();
			if(input.length() == 1 && (input.charAt(0)=='q'|| input.charAt(0)=='Q')) {
				break;
			}

		}
		sc.close();	
		System.out.print("��");
	}		
}
