package Chap05;
import java.util.Scanner;

// �Է¹��� ���� �� ���� ���� ������ ���� ���� ���� ���
// ù���� > �ι�° ���� ��
public class ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []stdscores;
		int stdcount, total=0;
		
		System.out.print("�л� ���� �Է��ϼ���:");
		stdcount = sc.nextInt();
		
		stdscores = new int [stdcount];
//		int[] max, min;
//		�����迭
		
		System.out.printf("%d ���� �л����� ������ �Է��ϼ���:",stdscores.length);
		for(int i =0; i<stdscores.length; i++) {
			stdscores[i] = sc.nextInt(); // nextint�� �ݺ��� �ȿ��� ����ϸ� �л����� ������ �ٷ� �о� �� �� ����.
			total+=stdscores[i];
		}
		sc.close();
//		System.out.println("\n[�Է��� �л��� ����]");
//		for(int i =0; i<stdscores.length; i++) {
//			System.out.print(stdscores[i]+"");
//		}
		
		System.out.println("\n[�Է��� �л��� ���]");
		for(int i =0; i<stdscores.length; i++) {
			System.out.print(stdscores[i]+"   ");
		}
		
		System.out.printf("\n ���� %d, ���:%.2f\n",total, (double)total / stdscores.length);
		
}
	}
