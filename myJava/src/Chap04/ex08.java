package chap04;


public class Ex08 {

	public static void main(String[] args) {		
		// 1���� 100 ������ ��� Ȧ���� ���� ���Ͽ� �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		
		int score = 0, num ;
//		for (int i =1;  i <= 100; i++) {
//			if ( i % 2 != 0 ) {
//				score += i;
//			}
//		}
//		System.out.print(score);
		
		for (int i=1; i<= 100; i+= 2) {
			score += i;
		}
		System.out.print(score);
	}
}
