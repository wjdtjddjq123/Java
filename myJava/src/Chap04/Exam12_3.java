package chap04;
/*
 * 1 ���� 100 ������ ��� �Ҽ��� �Ʒ��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * [ ���� �� ]
 * 		2	3	5	7	11
 * 	   13  17  19 ....
	��� ? � ���� �������� �� ����������� �ϴ� �ڿ���
	�Ҽ� ? 1�� �ڱ� �ڽ��� � ���� �������� �� ����������� �ϴ� �ڿ����� ������ ��
	step 3 ] 2���� 100 ������ �Ҽ��� ���Ͽ� ����ϼ���.
	
 */

public class Exam12_3 {

	public static void main(String[] args) {
		boolean isprime;
//		�Ҹ�Ÿ�� ����
		for (int i=2; i<=100; i++) {
			isprime = true; 
			// ���� ��
			for (int j=2; j<=i/2; j++) {
				if( i % j == 0) {
					isprime = false;
					break;
//			 i�� ���� �� ������ �ݺ������� ����� �������� �� �ϸ� prime�� ture, �����Ѵٸ� false 
				}
			}
			if (isprime) {
				System.out.print(i+"  ");
			}
		}
	}
}
