package chap04;

/*
  ���� ������ 0������ 100�� ������ ���̾�� �մϴ�.
  �ùٸ� ���� �ԷµǴ� ��쿡�� �л��� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
  
 
  
 */
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		sc.close();
		
		
		if(score <0 || score >100) {
			System.out.println("������ �ٽ� �Է��ϼ���.");
		}else if(score >=90) {
			System.out.println("�����߽��ϴ�~!");
		}else if(score >=80) {
			System.out.println("���߽��ϴ�~!");
		}else if(score >=70) {
			System.out.println("�����Դϴ�~!");
		}else if(score >=60) {
			System.out.println("�� �� ����ϼ���");
		}else {
			System.out.println("���������Դϴ�.");
		}
		
		System.out.println("���α׷�����");
		
		
	}

}
