package chap04;


public class Ex11 {

	public static void main(String[] args) {		
		int total = 0;
//		for (int i =1; i<=100; i++) {
//			total += i;
//		}
//		System.out.printf("%d", total);
		
		int i =1; // ���� �ʱ�ȭ
		
		while ( i<=100 ) { // ���ǽ� 
			total += i;
			i++; // ������, �ݺ���
			// �������� ���� �� ���ѷ���
			// ������ �����̾�߸� ��������
		}
		System.out.printf("1���� 100������ ��: %d", total);
	}
}
