package chap04;


public class Ex10 {

	public static void main(String[] args) {		
		for (int i = 0; i < 4; i++) {
			System.out.printf("%d\n",i);
			/* �ݺ������� i - j - k �̷������� ���������� ���� ���ĺ� ������ ���� 
			 * �� �ݺ����� ������ �ƴ� ���� ���� �߿���. ( ������� ������ �ִ���? 
			 */
			for(int j = 0; j<4; j++) {
				System.out.printf("    %d\n",j);
			}
		}
	}
}
