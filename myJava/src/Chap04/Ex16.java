package chap04;

/* 
 * 1���� 100 ������ ���� 5050�Դϴ�. �׷��ٸ� 1���� �� ������ ���� ���ʷ� 1000�� �ʰ��ϴ� ���ϱ��?
 * �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���
 * */


public class Ex16 {
	public static void main(String[] args) {
		for (int i = 0; i<100; i++) {
			System.out.println("i:"+i);
			
			if (i == 3) {
				break;
			}
			// i�� 3�� ���� �ٱ��� �ִ� ��ø �ݺ����� �����������.
			for (int j = 0; j < 100; j++) {
				System.out.println("\t j:"+j);
				if (j==2) {
					break;
				}
			}
		}
		
	}	
}

