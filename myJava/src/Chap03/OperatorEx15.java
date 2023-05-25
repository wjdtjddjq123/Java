package Chap03;
class OperatorEx15 { 
	// 대소문자 변환예제
      public static void main(String[] args) { 
            char lowerCase = 'a';  					  // 대상문자열 소문자 변환
            char upperCase = (char)(lowerCase - 32);  // 대상문자열 매문자 변환, 97 - 65 = 32

            System.out.println(upperCase);  // A 출력? 
      } 
} 
