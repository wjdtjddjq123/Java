package chap04;

/* 
 * 1���� 100 ������ ���� 5050�Դϴ�. �׷��ٸ� 1���� �� ������ ���� ���ʷ� 1000�� �ʰ��ϴ� ���ϱ��?
 * �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���
 * */


public class Ex15 {
	public static void main(String[] args) {
		int num = 0,i = 0;
		
//		while( num <= 1000 ) {
//			i++;
//			
////		 	������ ����� ��Ȳ, ���ǿ� ���� �󸶵��� ��ġ�� �ٲ� �� �ִ�.
////			
//			num += i;
//			
//		}
//		System.out.printf("1���� %d������ ���� %d �Դϴ�.",i,num);

		
//		�� Ȯ�� ����
		for ( i = 0; i < 46; i++) {
//		�ݺ������ϴ� ������ �����Ű�� ���� 
			num+=i;
		}
		System.out.printf("%d", num);
//		System.out.printf("1���� %d������ ���� %d �Դϴ�.", sum,i);
	}	
}

