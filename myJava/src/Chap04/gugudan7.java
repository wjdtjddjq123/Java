package chap04;
/*

	2�� ���� 9�� ������ ��ü ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	��, ��ø for �ݺ����� ����մϴ�.
  
*/
public class gugudan7 {

	public static void main(String[] args) {
		for(int i = 0; i <= 9; i++) {		// ���� �����ϴ� for��, ���� �ٲ�
			for (int j = 2; j<=9; j++) {	// ���ϴ� �ٸ� �����ϴ� for��
				if( i==0 ) {
				System.out.printf(" [ %d �� ] \t ",  j );
				}else {
				System.out.printf(" %d * %d = %d \t ", j , i , i*j );
				}
			}
			System.out.println("");
		}
//	}
//		for(int i =0; i<=9; i++) {
//			for(int j = 2; j<=9; j++) {
//				if(i==0) {
//					System.out.printf(" [ %d �� ] \t", j);
//				} else {
//					System.out.printf(" %d * %d = %d \t ", j, i, i*j );
//				}
//				System.out.println("");
//			}
//		}
	}
}
