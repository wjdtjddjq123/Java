package Chap06;

public class Time {
	int hour;
	int minute;
	int second;
	
	void setHour(int h) {
		hour = h;
	}
	
	void setMinute(int m) {
		minute = m;
	}
	
	void setSecond( int s ) {
		second = s;
	}
	
	String currentTime() {
		return hour + "�� " + minute + "�� " + second + "��";
	}
}
