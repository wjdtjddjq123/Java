package Chap06;

public class TimeTest {
	
	public static void main(String[] args) {
	Time[] timeArr;
	timeArr = new Time[3];
//	객체는 heap이라는 메모리 공간 안에 서로 다른 영역으로 만들어 짐
	timeArr[0] = new Time();
	timeArr[1] = new Time();
	timeArr[2] = new Time();
	
	timeArr[0].setHour(14); timeArr[0].setMinute(14); timeArr[0].setSecond(14); 
	timeArr[0].setHour(14); timeArr[0].setMinute(14); timeArr[0].setSecond(14);
	timeArr[0].setHour(14); timeArr[0].setMinute(14); timeArr[0].setSecond(14);
	
	for(int i=0; i<timeArr.length; i++) {
		System.out.printf("%d %d", timeArr[i],timeArr[i]);
	}
	}
}