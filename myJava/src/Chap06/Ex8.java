package chap06;

public class Ex8 {
	
	void changeParam(int num) {
		num *=2;
		System.out.println("[changeParam] num: " + num);

	}
	
	public static void main(String[] args) {
		int num = 1234;
		System.out.println("[�޼��� ȣ�� ��] num: " + num);

		//changeParam(num) �޼��� ȣ��
		
		Ex8 ex8 = new Ex8();
		ex8.changeParam(num);
		System.out.println("[�޼��� ȣ�� ��] num: " + num);
	}
//call by value :  ���� �����ؼ� �Ѱ���
}
