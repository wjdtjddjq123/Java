package Chap06;

public class ex03 {
	public static void main(String[] args) {
		Time [] timeArr = new Time[3];
//		객체는 heap이라는 메모리 공간 안에 서로 다른 영역으로 만들어 짐
//		Time Calss - Null 값으로 초기화 되어 짐

		for(int i =0; i<timeArr.length; i++) {
			timeArr[i] = new Time();
		}
		
		timeArr[0].setHour(14); timeArr[0].setMinute(14); timeArr[0].setSecond(14); 
		timeArr[1].setHour(9); timeArr[1].setMinute(30); timeArr[1].setSecond(33);
		timeArr[2].setHour(19); timeArr[2].setMinute(42); timeArr[2].setSecond(40);
		
		
		int i = 0 ;
		for(Time time:timeArr) {
//		배열 복사
//		첫번째 반복 : time, null 값 저장, 첫번째 타임 객체 생성 -> 타임변수에 주소 값 저장
//		두번째 반복 : time, null 값 저장, 두번째 타임 객체 생성 -> 타임변수에 주소 값 저장
//		반복이 끝나서 객체 사라짐,
			System.out.printf("time%d] %s \n ",i+1,timeArr[i].currentTime());
			i++;
	}
		
//		for(Time time:timeArr) {
//			배열 복사
//			첫번째 반복 : time, null 값 저장, 첫번째 타임 객체 생성 -> 타임변수에 주소 값 저장
//			두번째 반복 : time, null 값 저장, 두번째 타임 객체 생성 -> 타임변수에 주소 값 저장
//			반복이 끝나서 객체 사라짐, 
//			time = new Time();
//		}
//		
//		for(int i =0; i<timeArr.length; i++) {
//			System.out.printf("time%d] %s \n ",i+1,timeArr[i].currentTime());	
//		}


		
		
		
		
	}
}