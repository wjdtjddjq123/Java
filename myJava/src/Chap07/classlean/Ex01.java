package chap07.classlean;

public class Ex01 {

	public static void main(String[] args) {
		ClassB classB = new ClassB();
		
		// num1, num2, method1(), method2() ����� ���� ����� Ȯ���ϼ���.
		
		System.out.println("num1: " + classB.classA.num1);
		System.out.println("num2: " + classB.num2);
		System.out.println("method1() : " + classB.classA.method1());
		System.out.println("method2() : " + classB.method2());
	}

}
