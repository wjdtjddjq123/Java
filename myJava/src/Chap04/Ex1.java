package chap04;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 70) {
			System.out.println("�հ��Դϴ�~!");
			System.out.println("�����մϴ�~!");
		}
			System.out.println("���α׷�����~!");
		
		
		
	}

}
