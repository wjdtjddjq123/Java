package chap06;

public class Ex3 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		

		for(int num :arr1) {	//arr1�� ���� �����ؼ� ������. ������ �ȹٲ�
			num = num*2;
		}
		for(int i=0;i<arr2.length;i++) {	//���� �迭�� ���� ��������
			arr2[i] = arr2[i]*2;
		}
		
		for(int num :arr2) {
			System.out.print(num+ " ");
		}

	}

}
