package chap04;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("���ڿ��� �Է��ϼ���:");
//		input = sc.next();
		// �Է¹��� ������ �� �� �ڸ��� ����
		input = sc.nextLine();
		// �Է¹��� ������ �� �������� �� ���� , ����Ű�� ������ ����
		// ���۸� ���� �����ؾ� ���������� ���� ���� �� ����.
		System.out.println("");
		sc.close();
		for(int i =0 ; i< input.length(); i++) {
			// length = ���ڿ��� �����ϴ� ������ ����
			System.out.println(input.charAt(i));			
		}
	
	}
}