package Chap02;

class PrintfEx2 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";

		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // %f 실수출력
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); // %e 과학적 표기법으로 출력 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); // %g 가장 이상적인 형태의 값으로 출력

		System.out.printf("d=%f%n", d); // %값 반올림
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리, d=  1.2345678900

		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // ������ ����
		System.out.printf("[%.8s]%n", url);  // ���ʿ��� 8���ڸ� ���
	}
}
