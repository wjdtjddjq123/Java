package chap04;
import java.util.Scanner;

/*
����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
  ������1-
  �ϳ��� �Ǽ��� �Է��ϼ���> 3.64
  ����: 3
  �ݿø�: 4
  �ø�: 4
  
  ������2-
  �ϳ��� �Ǽ��� �Է��ϼ���: 6.2364
  ����: 6
  �ݿø�:6
  �ø�:7
  
  ������3-
  �ϳ��� �Ǽ��� �Է��ϼ���: 4.0
  ����: 4
  �ݿø�:4
  �ø�: 4
  
*/

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		num=sc.nextDouble();
		sc.close();
		
		System.out.println("����: "+(int)num);
		System.out.println("�ݿø�: "+(int)(num+0.5));
		
		//9.0/1
		
		if(num == (int)num) {
			System.out.println("�ø�: "+(int)(num));
		}else{
			System.out.println("�ø�: "+(int)(num+1));
		}
		
		
	}

}
