package oop;
/* 레퍼런스 배열 example */
public class Time {
	//레퍼런스배열 : 여러개의 레퍼런스 주솟값을 가지는 것
	int hour;
	int minute;
	int second;
	
	String getCurrntTime() {
//		반환만 하기때문에 출력을 따로 시켜주어야 함.
		return this.hour+"시 "+this.minute+"분 "+this.second+"초 ";
	}
}
