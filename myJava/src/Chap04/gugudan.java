package chap04;
import java.util.Scanner;
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
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ���� �Է��ϼ���:");
		
		int dan = sc.nextInt();
		
		System.out.printf("[ %d �� ] \n",dan);
		for(int i=1; i<=9; i++) 
			{
			System.out.printf("%d * %d = %2d \n", dan, i, i*dan);
			}
		}
	}
