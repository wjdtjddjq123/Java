package chap06;

public class Ex6 {
	void noReturn() {
		System.out.println("ù ��° ����");
		System.out.println("�� ��° ����");
		System.out.println("�� ��° ����");
	}
	void return1() {
		System.out.println("return1() �޼��� ȣ��");
		return;
	}	
	String return2() {
		System.out.println("return2() �޼��� ȣ��");
		return "ȣ����";
	}
	public static void main(String[] args) {
		//Ex5�������� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		Ex6 exTest = new Ex6();
		exTest.noReturn();
		exTest.return1();
		
		System.out.print("returnvalue: " + exTest.return2());
	}
}
