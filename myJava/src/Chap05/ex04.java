package Chap05;

// �Է¹��� ���� �� ���� ���� ������ ���� ���� ���� ���
// �迭�� Ȱ���ϴ� ��������
// ù���� > �ι�° ���� ��
public class ex04 {
	
	public static void main(String[] args) {
		int [] scores = {80,75,60,85,100,60};
		
		int maxScore, minScore;
//		�ְ���, ������ ���� ����
		
		minScore = scores[0]; // ù���� ������ �������̶� ���� 
		maxScore = scores[0]; // ù��° ������ �ְ����̶� ����
		
		for(int i =1; i <scores.length; i++ ) {
			if(minScore<scores[i]) {
				minScore = scores[i];
//				������ �迭 �� �� ���� ����.
			}
			if(maxScore>scores[i]) {
				maxScore = scores[i];
//				������ �迭 �� �� ���� ����
			}
		}System.out.printf("�ְ����� : %d, ��������:%d \n", maxScore, minScore );
		
	}
}
