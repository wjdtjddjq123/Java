package chap04;
import java.util.Scanner; // ��ĳ�� ����Ʈ 
/*

	2�� ���� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	��, �ϳ��� for �ݺ����� ����մϴ�.
	[ ���� �� ]
	
	
  	2 * 1 =  2
  	2 * 2 =  4
  	2 * 3 =  6
  	...
  	2 * 9 = 18
  	...
  	3 * 1 =  3
  	...
  	9 * 9 =  
  
*/
public class gugudan2 {

	public static void main(String[] args) {

	int dan = 2, num =1; 
	for(int i=0; i<72; i++) {
		System.out.printf("%d * %d = %d", dan, num, dan*num);
		num++;
		
		if(num==10) { // num�� 10 �Ѿ�ٸ�
			dan ++;   // dan 1����
			num = 1;  // num 1���� 
		}
		}
	}
}


