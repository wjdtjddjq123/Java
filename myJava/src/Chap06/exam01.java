package Chap06;
import java.util.Scanner;
/*
����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
��, ��ü����������
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
public class exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ��� :");
		double num = sc.nextDouble();
		exam01 a = new exam01();
		
		a.delArea(num);
		a.douArea(num);
		a.UpArea(num);
	}
	
	void UpArea (double a) {
		System.out.println("�ø�:"+(int)a);
//		�ø�
	}
	void delArea (double a) {
		System.out.println("����: "+(int)a);
//		����	
	}
	void douArea (double a) {
		
		if( a == (int)a) {
			System.out.println("�ø�: "+((int)a));
		}else {
			System.out.println("�ݿø�: "+((int)a+1));
		}
//		�ݿø�
	}
	
}
