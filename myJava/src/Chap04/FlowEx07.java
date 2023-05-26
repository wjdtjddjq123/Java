package Chap04;
import java.util.*;

class FlowEx07 {
	public static void main(String[] args) { 
		int user, com;

		System.out.print("가위(1),바위(2),보(3)중 하나를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 저장
		user = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)를 숫자로

		com = (int)(Math.random() * 3) + 1;  // 1,2,3중 하나가 com에 저장

		System.out.println("����� "+ user +"�Դϴ�.");
		System.out.println("����  "+ com +"�Դϴ�.");
		scanner.close();
		switch(user-com) {
			case 2: case -1:
				System.out.println("����� �����ϴ�.");
				break;
			case 1: case -2:
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
	//			break;		// ������ �����̹Ƿ� break�� ����� �ʿ䰡 ����. 
		}
	} // main�� ��
}
