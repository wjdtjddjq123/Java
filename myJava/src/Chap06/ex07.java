package Chap06;
/*
 

*/
public class ex07 {

	public static void main(String[] args) {
		
		ex07 a = new ex07();
		int radius = 7;
		a.printCharacter('*', 50);
		a.printTitle();
		a.printCharacter('*', 50);
		
		System.out.printf("�������� %d�� ���� ������ ���̴� %f�Դϴ�. ", radius, a.getCircleArea(radius));
		
	}
	
	
	double getCircleArea ( int radius) {
		double result; 
		result = radius * radius * getPi();	
		return result;
//		�������� �Է����� �޾� ���� ���̸� ����Ͽ� ��ȯ�ϴ� �޼���
	}
	
	void printTitle() {
// 		���α׷��� ������ ����ϴ� �޼���
//		�Է°�, ��ȯ�� X
		System.out.println("\t ���� ���� ��� ���α׷�");
	}
	
	
	
	void printCharacter(char ch, int count ) {
// 		�Է����� �־��� ���ڸ� count ��ŭ ����ϴ� �޼���
//		�Է°�O, ��ȯ�� X
			for (int i =0; i < count; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	
	double getPi() {
//		Pi ���� ��ȯ�ϴ� �޼���
//		�Է°� X, ��ȯ��O
		double pi = 3.14;
		return pi;
	}
	

}
	