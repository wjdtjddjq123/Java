package Chap06;

public class TimeTest {
	
	public static void main(String[] args) {
	Time[] timeArr;
	timeArr = new Time[3];
//	��ü�� heap�̶�� �޸� ���� �ȿ� ���� �ٸ� �������� ����� ��
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