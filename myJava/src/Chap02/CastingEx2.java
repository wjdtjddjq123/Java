package Chap02;

class CastingEx2 {
	public static void main(String[] args) {
		int  i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); // i = 10 -> b=10
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //  i = 300 -> b = 44, byte 역전환 - 256

		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // b = 10 -> i= 10

		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // b = -1 -> i= -2

		System.out.println("i="+Integer.toBinaryString(i)); // int 32개가 전부 다 1이면 1, 끝 자리 하나가 0이면 마이너스
		
	}
}
