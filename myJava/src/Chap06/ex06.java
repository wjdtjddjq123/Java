package Chap06;
/*
 

*/
public class ex06 {
	public static void main(String[] args) {
		/*ex5 ���� ����� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���. */
		ex06 a = new ex06();
		a.noreturn();
		a.return1();
		System.out.println(a.return2());
		
	}
	
	void noreturn() {
		
		System.out.println("ù��° ����");
		System.out.println("�ι�° ����");
		System.out.println("����° ����");
		}
		
	void return1() {
		System.out.println("return1 ȣ��");
		return;
//			���� �� 
		}
		
	String return2() {
		System.out.println("return2 ȣ��");
		return "ȣ����";
//			���� ��
	}
}