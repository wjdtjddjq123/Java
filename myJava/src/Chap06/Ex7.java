package chap06;

public class Ex7 {
	//���α׷��� ������ ����ϴ� �޼���
	void printTitle() {
		System.out.println("\t ���� ���� ��� ���α׷�");
	}	
	// �Է����� �־��� ���ڸ� count ��ŭ ����ϴ� �޼���
	void printCharacter(char ch, int count) {
		for(int i=0;i<count;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	//pi���� ��ȯ�ϴ� �޼���
	double getPi() {
		double pi = 3.141592;
		return pi;
	}
	//�������� �Է����� �޾� ���� ���̸� ����Ͽ� ��ȯ�ϴ� �޼���
	double getCircleArea(int radius) {
		
		double result;
		result = radius * radius * getPi();
		return result;
	}
	
	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		int radius = 7;
		ex7.printCharacter('*', 35);
		ex7.printTitle();
		ex7.printCharacter('*', 35);
		
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ�\n", radius, ex7.getCircleArea(radius));

	}

}