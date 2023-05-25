package Chap02;


class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f); // int타입으로 저장
		
		System.out.println(i);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16진수 출력
	} // main끝
}
