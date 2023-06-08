package Chap06;
// 필드사용예제
public class FloatToInteger {
	double num;
//	FloatToInteger(){}
	void setNum(double a) {
		num = a;
//		사용자 입력 값 받는 곳
	}
	int floor() {
//		버림
		return(int)num;
	}
	int round() {
		return(int)(num+0.5);
//		반올림
	}
	int ceil() {
		int result =0;
//		올림
		if(num == (int)num) {
			result = (int)num;
		}else {
			result = (int)(num+1);
		}
		return result;
	}
}
