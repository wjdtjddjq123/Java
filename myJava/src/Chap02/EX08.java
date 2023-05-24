package Chap02;

public class EX08 {
//  명시적 형변환
	public static void main(String[] args) {
		float f = 0.12345678901234567890f;
		double d = 0.12345678901234567890;
		
		System.out.println(f+"D"+d);
		// 정밀도, 실제 유효값이 다르게 나와서 Float < Double 함수를 이용해서 정밀도있게 개발
		// int → byte (Type) 생략불가

	}

}
