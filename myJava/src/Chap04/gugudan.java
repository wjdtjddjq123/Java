package chap04;
import java.util.Scanner; // ��ĳ�� ����Ʈ 
/*
  ����ڿ��� �������� ���� �Է¹޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
  ���� ��]
  
  �������� ���� �Է��ϼ���.
  
  [ 4�� ]
  4 * 1 =  4
  4 * 2 =  8
  4 * 3 = 12
  ...
  4 * 9 = 36
  
*/
public class gugudan {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�������� ���� �Է��ϼ���:");
//		
//		int dan = sc.nextInt();
//		
//		System.out.printf("[ %d �� ] \n",dan);
//		for(int i=1; i<=9; i++) 
//			{
//			System.out.printf("%d * %d = %2d \n", dan, i, i*dan);
//			}
	
	Scanner sc = new Scanner(System.in); 	 // ��ĳ�� ���
	System.out.print("�������� ���� �Է��ϼ���:"); // 
	
	int dan = sc.nextInt(); 	// ��ĳ�� ��� �̿��ؼ� Ű����� �Է¹��� ���� �ʱ�ȭ
	
	System.out.printf("[ %d �� ] \n",dan); // ���� ��� 

	sc.close(); // ��ĳ�� ����
	for(int i=1; i<=9; i++){ // for��, i�� 1; i�� 9����; i�� 1�� ���� 
		System.out.printf("%d * %d = %2d \n", dan, i, i*dan);
		// ù��° %d = dan, �ι�° %d = i, ����° %2d = i*dan ( �ι�° �ڸ����� �� ��� ���� ������ ���� )
		}
	}	
}


