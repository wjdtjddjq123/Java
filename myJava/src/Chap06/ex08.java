package Chap06;
public class ex08 {
	
	void changeparam(int num) {
		num *= 2;
		System.out.println("[chanegeParam()] num:"+ num);
	}
	
	public static void main(String[] args) {
		int num =1234;
		System.out.println("�޼��� ȣ�� �� num:"+ num);
		
		ex08 a = new ex08();
//		changeparam() �޼��� ȣ��
		a.changeparam(num);
//		call by value ȣ�� : ���� ���� ȣ�� (������ ���� �����ؼ� �Ѱ��ִ� ��)	
		System.out.println("�޼��� ȣ�� �� num:"+ num);
	}
}
	