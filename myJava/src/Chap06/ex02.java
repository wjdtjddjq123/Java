package Chap06;

public class ex02 {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};
		
		for(int num : arr1 ) {
			num = num * 2 ;
//			num ������ ������ ��, �����ؼ� ������ �ִ� �迭 ������ ���� �ٲ㵵 ���� �迭�� �� �ٲ�.
//			������ �� ���� 
		}
		
		for(int i=0; i<arr2.length; i++ ) {
			arr2[i] = arr2[i]* 2;			
//			num ������ ������ ��, �����ؼ� ������ �ִ� �迭 ������ ���� �ٲ㵵 ���� �迭�� �� �ٲ�.
//			���� �迭�� ���� ���� �����ϴ� ��
		}
		for(int num : arr2 ) {
			System.out.print(num+"  ");
		}
	}		
}