package Chap06;
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
//	�ø��� ��
	void UpArea (double a) {
		if(a == (int)a) {
			System.out.print("�ø�: "+(int)a);
		}else {
			System.out.println("�ø�: "+((int)a+1));
		}
	}
//	������ ��
	void delArea (double a) {
		System.out.println("����: "+(int)a);
	}
//	�ݿø� �ϴ� ��
	void douArea (double a) {
		if( a == (int)a) {
			System.out.println("�ݿø�: "+((int)a));
		}else {
			System.out.println("�ݿø�: "+((int)(0.5+a)));
		}
	}
}
