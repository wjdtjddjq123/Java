package Chap06;
public class ex10 {
	
	int sum(int num) {
//		
		if( num == 1 ) {
//		num�� 1�� ��
			return 1;
//		1��ȯ
		}
		return num+sum(num-1);
//		��ȯ ���� �� 10 �϶� 9 ���ϱ�
//		9�϶� 8���ϱ�... 1�� ���� �� ���� �ݺ�
//		
	}
	
	public static void main(String[] args) {
	
		ex10 sum = new ex10();
		System.out.print("total : " + sum.sum(10));
	}
}
	