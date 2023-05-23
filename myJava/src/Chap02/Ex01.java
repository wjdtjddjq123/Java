package Chap02;


public class Ex01 {
	public static void main(String[] args) {
		int math_score = 75, eng_scrore= 85 ; // 변수 선언 및 초기화

/*		   주석 1. multi-line comment
 * 		// 주석 2. single-line comment 
 * 
 * 
 		   선언 방법 1. math_score = 95; // 변수 값 초기화.
		               eng_scrore = 80;
		   선언 방법 2. int math_score = 75, eng_scrore= 85
		   
		   선언 방법 3. int math_score, eng_scrore= 85;
		   int math_score = 80;
		   
		   빨간 줄 - 컴파일 오류 컴파일 자체 불가
		   노란 줄 (경고) - 컴파일 됨, 컴파일 실행 시 문제가 될 수 있음.
		   System.out.println(math_score); 초기화 되지 않은 변수는 사용할 수 없음
		               
*/

		
		System.out.println("math_score:"+math_score); // math_score 출력
		System.out.println("eng_scrore:"+eng_scrore); // eng_scrore 출력
		
//		문자열 + 숫자 -> 문자열, 문자열 연결 연산자

	}
}
