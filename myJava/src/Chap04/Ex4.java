package chap04;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 90) {
			System.out.println("�����߽��ϴ�~!");
		}else if(score >=80) {
			System.out.println("���߽��ϴ�~!");
		}else if(score >=70) {
			System.out.println("�����Դϴ�~!");
		}else if(score >=60) {
			System.out.println("�� �� ����ϼ���");
		}else {
			System.out.println("����� ����Դϴ�.");
		}
		
		System.out.println("���α׷�����");
		
		
	}

}
