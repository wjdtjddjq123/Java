package chap04;

public class Ex17 {
	public static void main(String[] args) {
		int total = 0;
		int i = 1;
//		
//		while(true) { 			// ���ѹݺ�
//			total += i;
//			
//			if(total > 1000 ) { // total 1000�Ѿ�� ����
//				
//				break;
//			}
//			i++;				// 1000���� ����, i�� �� �������� �ʽ��ϴ�.
//		}
//		
		for(;;i++) {			// ���ѹݺ�
				
			total += i;
				
			if(total > 1000 ) { // total 1000�Ѿ�� ����
			break;
			}			// 1000���� ����, i�� �� �������� �ʽ��ϴ�.
		
		System.out.printf("1 ���� %d ������ ���� %d �Դϴ�.", i,total);
		}	
	}
}

