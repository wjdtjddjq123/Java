package Chap05;

// �ζǹ�ȣ ���
public class ex05 {
	
	public static void main(String[] args) {
		int[] ball = new int[45];
//		ball������ 45���� �迭�� ����
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;   // ball[0]�� 1���� -> ball[0]= 0���� ball[0]= 1 ���� ����
			
		}
			int num = 0;  // �� ���� �ٲٴµ� ���Ǵ� �ӽú���
			int copynum = 0; // ���� ���� ��� ����ϴ� �ӽ� �����
			

//			�迭�� ����� ���� �� ���̵��� ����� ū �ݺ�Ƚ���� �����Ѵ�.
//			�迭�� ù ��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
			
			for(int j = 0; j<100; j++) {
				 copynum = (int)(Math.random()*45); // �迭����(0~44)�� ������ ���� ��´�.
		
				 num = ball[0]; 			// �ӽú����� ball�� ���� 1 ~ 45
				 ball[0] = ball[copynum];   // ball ���� ���� ���� ��� ����ϴ� �ӽ�������� ���� ����
				 
				 // ���� �ٲٴ� �۾� : ����
				 ball[copynum] = num; 	  	// �ӽ�������� ���� �ӽú����� ����.
			}
			
			for (int k = 0; k < 6; k++) {
				System.out.print(ball[k]+"  ");
			}
		}
		
		
	}
