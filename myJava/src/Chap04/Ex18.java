package chap04;
/*
 * 1���� 100 ������ ¦���� ���� ���ϴ� �ڵ带 �ۼ��ϼ���. 
 * ��, continue�� ����մϴ�. 
 * 
 * */
public class Ex18 {
	public static void main(String[] args) {
		int total =0;
		int i = 0 ;

		while( i <= 100 ) {
			i++; 
			// continue �ǳ� �ٸ� ���ǽ����� ���� ������ ���⼭ �������Ѷ�
			
			if( i % 2 != 0 ) {
			// i�� Ȧ���̸� �ǳ� �پ�� 
			
				continue;
			// �� �������� �������� �����ϴ� �ڵ带 �������� �����ض�.
			// �ǳ� �ٸ� ���ǽ����� ���� �� ���� ���������� ����
			}
			total += i;
		
		}
		System.out.println("total:"+total);
	}
}

