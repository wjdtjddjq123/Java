package Chap06;
/*
사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
단, 객체지향적으로
  실행결과1-
  하나의 실수를 입력하세요> 3.64
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
public class exam01 {
//	올리는 거
	void UpArea (double a) {
		if(a == (int)a) {
			System.out.print("올림: "+(int)a);
		}else {
			System.out.println("올림: "+((int)a+1));
		}
	}
//	버리는 거
	void delArea (double a) {
		System.out.println("버림: "+(int)a);
	}
//	반올림 하는 거
	void douArea (double a) {
		if( a == (int)a) {
			System.out.println("반올림: "+((int)a));
		}else {
			System.out.println("반올림: "+((int)(0.5+a)));
		}
	}
}
