package chap04;


public class Ex09 {

	public static void main(String[] args) {		
//	1���� 100 ������ �� �� Ȧ���� �հ� ¦���� ���� ���ÿ� ���Ͽ� �� ����� 
//	����ϴ� �ڵ带 �ۼ��ϼ���.
		int A = 0,B = 0, C=0;
//		for (int i =1;  i <= 100; i++) {
//			if ( i % 2 != 0 ) {
//				A+= i;
//			}
//			else {
//				B += i;
//			}
//		}
//		C =A+B;
//		System.out.print("\n A�� ��:"+A);
//		System.out.print("\n B�� ��:"+B);
//		System.out.printf("\n %d+%d = %d",A,B,C);
//		for (int i=1, j=1; i <= 100 && j <= 100; i++, j+=2 ) {
//			A += i;
//			B += j;
//			C = A+B;
//		}
//		System.out.printf("%d+%d=%d",A,B,C);
		
		for(int i =2, j=1; j<=100 && i<=100; i+=2, j+=2) {
			A += i;
			B += j;
		}
		System.out.println("1 ���� 100�� ���� Ȧ���� ����"+A+"�Դϴ�.");
		System.out.println("1 ���� 100�� ���� Ȧ���� ����"+B+"�Դϴ�.");
	}
}
