package chap04;
import java.util.Scanner; // ��ĳ�� ����Ʈ 
/*

	2�� ���� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	��, �ϳ��� for �ݺ����� ����մϴ�.
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
  	9 * 9 =  
  
*/
public class gugudan3 {

	public static void main(String[] args) {

	
//	Scanner sc = new Scanner(System.in); 	 // ��ĳ�� ���
//	System.out.print("�������� ���� �Է��ϼ���:"); // 
//	
	int dan=2,num =1; 

//	sc.close(); // ��ĳ�� ����
	
//	for(int i=0; i<72; i++) { // i �� 72 ���� ����
//		if(num==1) {
//			System.out.printf("[ %d �� ] ", dan);
//		}
//		System.out.printf("%d * %d = %2d \n", dan, num, dan*num);
//		num++;
//		if(num == 10) {
//			dan ++;
//			num = 1;
//			
//		}
//		}
	/* 
	
	����Ǿ����� �ʴ� ����
	�ϳ��� �ݺ����� �ϳ��� ������ ���ؼ��� ����ؾ���.
	�Ʒ� �ڵ�� ���δٸ� �ΰ� �̻��� �پ��� ������ ���� ����ϰ� ��
	�� �� �̻��� �ٸ� ������ ���� ����ϰ� �Ǹ�, ��ư� ��������.
	
	�ݺ����� ������ �� ���� �������� ���ؼ� ��� �Ǿ����.
	
	*/
	for(int i=0; i<72; i++) { 
	
	if(num == 1) {
		System.out.printf("\n[ %d �� ] \n", dan);
	}
		System.out.printf("\n%d * %d = %2d", dan, num, dan*num);
		num++;
	
	if ( num == 10 ) {
		dan ++;
		num = 1;
			}
		}
	}
}

