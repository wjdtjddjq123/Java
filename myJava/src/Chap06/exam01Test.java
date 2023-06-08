package Chap06;
import java.util.Scanner;
/*
사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
단, 객체지향적으로
  실행결과1-
  하나의 실수를 입력하세요 : 3.64
  버림: 3
  반올림: 4
  올림: 4
  
  실행결과2-
  하나의 실수를 입력하세요: 6.2364
  버림: 6
  반올림:6
  올림:7
  
  실행결과3-
  하나의 실수를 입력하세요: 4.0
  버림: 4
  반올림:4
  올림: 4
  
*/
public class exam01Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 실수를 입력하세요 :");
		double num = sc.nextDouble();
		sc.close();
		exam01 a = new exam01();
//		System.out.printf("입력하신 값 %.4f \n", num);
		a.delArea(num);
		a.douArea(num);
		a.UpArea(num);
	}
	
}
