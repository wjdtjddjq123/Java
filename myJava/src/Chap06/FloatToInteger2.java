package Chap06;

public class FloatToInteger2 {
	double num;
	FloatToInteger2(){
//		매개변수가 없는 디폴트 생성자
	}
//	FloatToInteger2(double num){
//		this.num = num;
////		로컬변수(매개변수)와 필드변수(인스턴스 변수)는 이름이 같을 수 있다. 단, 로컬변수가 우선 순위이다.
////		new라는 키워드로 인스턴스를 만들면 자동으로 this라는 레퍼런스가 제공된다.
////		this 레퍼런스는 자기자신의 객체를 가르킨다.
////		클래스안에서 다른클래스멤버를 사용할 때는 this.을 붙여라 이 뜻은 자기 자신의 필드나 메서드를 의미하기 때문이다.
////		this를 쓰면 인스턴스 변수의 값을 저장하기위해서 사용하는 매개변수의 이름을 실제필드와 같이 똑같이 지정할수 있다.
////		this는 인스턴스를 사용할 때마다 자기 자신을 참조할 때 마다 참조하는 레퍼런스이다.
////		생성자 2개
//	}
	
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