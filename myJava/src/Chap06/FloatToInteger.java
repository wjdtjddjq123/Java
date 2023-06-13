package chap06;

/*
 사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
단, 객체지향적으로 코드를 작성합니다.

실행결과1]

하나의 실수를 입력하세요: 3.64

버림: 3
반올림: 4
올림: 4
==========================================================

실행결과2]

하나의 실수를 입력하세요: 6.2364

버림: 6
반올림: 6
올림: 7
==========================================================

실행결과 3]

하나의 실수를 입력하세요: 4.0

버림: 4
반올림: 4
올림: 4
*/

public class FloatToInteger {
	double num;
	
	FloatToInteger(){
		
	}//디폴트 생성자
	
	void setNum(double a) {
		num = a;
	}
	
	int floor() {
		return (int)num;
	}
	int round() {
		return (int)(num+0.5);
	}
	
	int ceil() {
		int result = 0;
		if((int)num == num) {
			result = (int)num;
		}
		else {
			result = (int)(num+1);
		}
		return result;
	}




}
	
/*
	double burimNum(double num) {
		num = (int)num;
		return num;
	}

	double bolimNum(double num) {
		num = (int)((num + 0.5));
		return num;
	}
	double olimNum(double num) {

		if(num==(int)(num)) {
			num = (int)num;
		}
		else {
		num = (int)((num + 1));
		}
		return num;
	}
}
*/