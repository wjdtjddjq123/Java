package chap04;
/*
 * 1 ���� 100 ������ ��� �Ҽ��� �Ʒ��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * [ ���� �� ]
 * 		2	3	5	7	11
 * 	   13  17  19 ....
	��� ? � ���� �������� �� ����������� �ϴ� �ڿ���
	�Ҽ� ? 1�� �ڱ� �ڽ��� � ���� �������� �� ����������� �ϴ� �ڿ����� ������ ��
 */

public class Exam12_4 {

	public static void main(String[] args) {
		
		boolean prime;
		int count=0;
		
		for(int i =2; i<=100; i++) {
			prime = true;
			for(int j=2; j<=i/2;j++) {
				if( i%j==0) {
					prime =false;
					break;
				}
			}
			if(prime) {
				count ++;
				System.out.printf("%3d",i);
				
				if( count % 5 == 0) {
					System.out.println("");
				}
			}
		}
		
		
	}
}
