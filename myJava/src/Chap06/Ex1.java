package chap06;

public class Ex1 {

	public static void main(String[] args) {
		
		String[] fruits = {"���", "����", "�ٳ���", "������", "����"};
		
		//���� for���� ����Ͽ� ��� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		
		for(String fruit : fruits) {
			System.out.print(fruit +" ");
		}
		
		/*
		int [] lotto = new int[6];
		
		lotto[0] = 7;
		lotto[1] = 12;
		lotto[2] = 19;
		lotto[3] = 25;
		lotto[4] = 33;
		lotto[5] = 40;
		
		for(int num: lotto) {
			System.out.print(num + " ");
		}
		
		
		for(int i =0;i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}
		*/
	}

}
