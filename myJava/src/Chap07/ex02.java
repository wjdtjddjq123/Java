package Chap07;

public class ex02 {

	public static void main(String[] args) {
		ClassC ClassC = new ClassC();
//		num1, num2, method1, method2 ����� ���� ����� Ȯ���ϼ���.
		ClassC.method3();
		System.out.println("num1:" + ClassC.num1);
		System.out.println("num3:" + ClassC.num3);
		System.out.println("method1:" + ClassC.method1());
		System.out.println("method1:" + ClassC.method3());

	}

}
