package chap04;
/*

	2�� ���� 9�� ������ ��ü ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	��, ��ø for �ݺ����� ����մϴ�.
  
*/
public class gugudan6 {

	public static void main(String[] args) {
//		for(int i = 1; i <= 9; i++) {
//			// ���� �����ϴ� for��, ���� �ٲ�
//				System.out.print("\n");
//			for (int j = 2; j<=9; j++) {
//			// ���ϴ� �ٸ� �����ϴ� for�� 
//				System.out.printf(" %d * %d = %d \t ", j , i , i*j );
//			}
//		}
		for (int num = 1; num <=9; num++) {
			for(int dan = 2; dan <=9; dan++) {
				System.out.printf(" %d * %d = %d \t ", dan , num , dan*num );
			}
			System.out.println();
		}
	}
}