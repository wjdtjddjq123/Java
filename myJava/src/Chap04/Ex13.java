package chap04;

/* �Ʒ��� ���� for �ݺ����� ��ø while �ݺ��������� ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���. */


public class Ex13 {


	public static void main(String[] args) {
		int total = 0;
//		for (int i =1; i<=100; i++) {
//			total += i;
//		}
//		System.out.printf("%d", total);
		
		int i =1; // ���� �ʱ�ȭ
		
		do {
			total += i;
			i++; // ������, �ݺ���
			
			// �������� ���� �� ���ѷ���
			// ������ �����̾�߸� ��������
		}while ( i<=100 ); // ���ǽ�
		System.out.printf("1���� 100������ ��: %d", total);
	}

}