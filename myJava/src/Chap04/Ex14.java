package chap04;

/* �Ʒ��� ���� for �ݺ����� ��ø do while �ݺ������� ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���. */


public class Ex14 {


	public static void main(String[] args) {
		int num = 0;
		do {
			num++;
		}while(num <= 9);{
			int dan = 2;
			while(dan <=9);{
				if( num == 0 ) {
					System.out.printf(" [ %d �� ] \t ",  dan );
					} else {
					System.out.printf(" %d * %d = %d \t ", num , dan , num*dan );
					}
					dan++;
			}System.out.println("");
		}
	}	
}


//int total = 0;
//for (int i =1; i<=100; i++) {
//	total += i;
//}
//System.out.printf("%d", total);
//
//int i =1; // ���� �ʱ�ȭ
//
//do {
//	total += i;
//	i++; // ������, �ݺ���
//	
	// �������� ���� �� ���ѷ���
	// ������ �����̾�߸� ��������
//}while ( i<=100 ); // ���ǽ�
//System.out.printf("1���� 100������ ��: %d", total);