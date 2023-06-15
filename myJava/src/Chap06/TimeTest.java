package chap06;

public class TimeTest {

	public static void main(String[] args) {
		Time [] timeArr;
		timeArr = new Time[3];
		
		/*
		timeArr[0] = new Time();
		timeArr[1] = new Time();
		timeArr[2] = new Time();
		
		for(int i = 0; i < timeArr.length; i++) {
			System.out.printf("time%d] %s \n", i + 1, timeArr[i].currentTime());
		}
		*/
		timeArr[0].setHour(14); timeArr[0].setMinute(30); timeArr[0].setSecond(25);
		timeArr[1].setHour(9); timeArr[1].setMinute(52); timeArr[1].setSecond(33);
		timeArr[2].setHour(19); timeArr[2].setMinute(8); timeArr[2].setSecond(40);
		
		
		for(int i = 0; i < timeArr.length; i++) {
			System.out.printf("time%d] %s \n", i + 1, timeArr[i].currentTime());
		}
		
		/*
		Time t1, t2, t3;
		
		t1 = new Time();
		t2 = new Time();
		t3 = new Time();
		
		t1.setHour(14); t1.setMinute(30); t1.setSecond(25);
		t2.setHour(9); t2.setMinute(52); t2.setSecond(33);
		t3.setHour(19); t3.setMinute(8); t3.setSecond(40);
		
		System.out.println("time1] " + t1.currentTime());
		System.out.println("time2] " + t2.currentTime());
		System.out.println("time3] " + t3.currentTime());
		*/
	}

}
