package chap04;

/* �Ʒ��� ���� for �ݺ����� ��ø while �ݺ��������� ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���. */


public class Ex12 {


	public static void main(String[] args) {
		int num = 0;
		while(num <= 9) {// ���� �����ϴ� for��, ���� �ٲ�
			int dan = 2;
			while (dan <=9 ) {	// ���ϴ� �ٸ� �����ϴ� for��
				if( num == 0 ) {
				System.out.printf(" [ %d �� ] \t ",  dan );
				} else {
				System.out.printf(" %d * %d = %d \t ", num , dan , num*dan );
				}
				dan++;
			}
			System.out.println("");
			num++;
			
		}
		
		
		
	}

}

//int i =1; // ���� �ʱ�ȭ
//
//while ( i<=100 ) { // ���ǽ� 
//	total += i;
//	i++; // ������, �ݺ���
//	// �������� ���� �� ���ѷ���
//	// ������ �����̾�߸� ��������
//}
//System.out.printf("1���� 100������ ��: %d", total);
