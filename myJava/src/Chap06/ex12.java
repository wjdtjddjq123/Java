package Chap06;
/* �����ε� */
public class ex12 {
	public static void main(String[] args) {
		FloatToInteger2 fti1, fti2;
		double num1 = 3.6, num2 = 3.4;
		
		fti1 = new FloatToInteger2();
		fti1.setNum(num1);
//		(����Ʈ ������ ���)ù��° �����ڸ� �̿��ؼ� �ν��Ͻ� ����
//		setNum�� ȣ���ؼ� ������ ���� �Ѱ���
		fti2 = new FloatToInteger2();
//		�ι�° �����ڸ� �̿��ؼ� �ν��Ͻ� ����, ���� �־��־��� ������ ������� �� ���� 3.4��°��� ����
//		ó������ ���� ���ϴ� ���� �־��� �� �ִ�.
		System.out.println("\t ����: "+fti1.floor());
		System.out.println("\t �ݿø�: "+fti1.round());
		System.out.println("\t �ø�: "+fti1.ceil());
		System.out.println("==============================");
		System.out.println("\t ����: "+fti2.floor());
		System.out.println("\t �ݿø�: "+fti2.round());
		System.out.println("\t �ø�: "+fti2.ceil());
	}
}
	