package chap04;
/*

	2�� ���� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	��, ��ø for �ݺ����� ����մϴ�.
	[ ���� �� ]
	
	[ 2�� ]
  	2 * 1 =  2
  	2 * 2 =  4
  	2 * 3 =  6
  	...
  	2 * 9 = 18
  	...
  	[ 3�� ]
  	3 * 1 =  3
  	...
  	9 * 9 = 81
  
*/
public class gugudan5 {

	public static void main(String[] args) {

		for( int i=0; i <= 9; i++) {
				System.out.printf("[ %d �� ]\n", i);
			for (int j =1; j<=9; j++) {
				System.out.printf("%d * %d = %2d \n ", i, j, i*j);
			}
		}
	}
}

