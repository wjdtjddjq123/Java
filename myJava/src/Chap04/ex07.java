package chap04;


public class Ex07 {

	public static void main(String[] args) {		
		
		int i, total=0;
		for(i= 1; i<=10; i++) {
			total += i;
			System.out.printf("i : %d, total : %d\n",i,total);
		}
		System.out.printf("[for �ݺ��� ���� i : %d]", i);
//		i�� �ݺ����� ���� : �ݺ��� ����ǰ� ����� �� ����.
	}
}
