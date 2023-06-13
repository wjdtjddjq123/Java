package chap06;

public class Ex2 {

	public static void main(String[] args) {
		Time [] timeArr;
		timeArr = new Time[3];
	
		for(int i=0;i<timeArr.length;i++) {
				timeArr[i] = new Time();
		}
	
		timeArr[0].setHour(14); timeArr[0].setMinute(30); timeArr[0].setSecond(25); // ½Ï´Ù null
		timeArr[1].setHour(9); timeArr[1].setMinute(52); timeArr[1].setSecond(33);
		timeArr[2].setHour(19); timeArr[2].setMinute(8); timeArr[2].setSecond(40);
		
	
		int i = 0;
		for(Time time:timeArr) {
			System.out.printf("time%d] %s \n", i + 1, time.currentTime());
		}
	
		
	}
		
}
