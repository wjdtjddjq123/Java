package Chap02;

class PrintfEx1 {
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10; 
		long big = 100_000_000_000L;       
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       //  8진수 10, 10진수로는 8
		int hexNum = 0x10;      // 16진수 10, 10진수로는 16
		int binNum = 0b10;      //  2진수 10, 10진수로는 2

		// %로 시작하는 문자는 서식 문자
		
		// print 값 출력후 멈춤
		// println 값 출력 후 대행
		// d%는 외부로부터 주어진 값을 읽어서 출력 10진수 , %n은 대행, %c 단일문자 출력
		
		System.out.printf("b = %d %n", b); 			 			// b = 1
		System.out.printf("s=%d%n", s); 	  	 				// s = 2
		System.out.printf("c=%c, %d %n", c, (int)c); 			// c=A
		System.out.printf("finger=[%5d]%n",  finger);			// [   10]
		System.out.printf("finger=[%-5d]%n", finger);			// [10   ]
		System.out.printf("finger=[%05d]%n", finger);			// [00010]
		System.out.printf("big=%d%n", big); 		  			// big = 10000000000 
		System.out.printf("hex=%#x%n", hex); 					// hex
		System.out.printf("octNum=%o, %d%n", octNum, octNum);   // 

		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); ;   
		System.out.printf("binNum=0b%s, %d%n", Integer.toBinaryString(binNum), binNum); // 정수 값 제공 자바 클래스 : integer
		
		/*
		'#'은 접두사(16진수 0x, 8진수 0 )
		
		
		// [%5d]-> 5자리 10진 정수로 출력해라.*/
	  
	}
}
