package Chap06;
import java.util.Scanner;
/*
�Ʒ� ���������� �ڵ带 �̿��Ͽ� ��ü���� ����� ������ �ڵ�� ��ȯ�Ͽ� �ۼ��ϼ���.
 */
public class exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����������Է��ϼ���");
		RPS_2 rps;
		
		String intro = "���������� ����";
		rps = new RPS_2(sc.nextInt());
		
		System.out.printf("\n\t �����: %s, ��ǻ�� %s \n",rps.getUser(),rps.getCom());
		System.out.printf("\t  ���������� ��� ==> %s\n",rps.judge());
		
		
	}

}