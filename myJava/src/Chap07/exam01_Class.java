package chap07;

public class exam01_Class {
	
	int year;
	int month;
	int day;
	
	int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 각 월의 일수
	String [] week = {"일", "월", "화", "수", "목", "금", "토"};	
	
	int totalDays (int num) {
		for(int i = 1; i < year; i++) {
			// 윤년, 평년 계산 알고리즘
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				// 윤년
				num += 366;
			}
			else {
				// 평년
				num += 365;
			}
		}
		// 해당 년도 이전 달까지의 일 수 더하기
		for(int j = 1; j < month; j++) {
			if(month == 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
					monthLastDays[2] = 29;
				}
				else {
				num += monthLastDays[j];
				}
		}
		return num;
	}
	void claender(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
		
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.", year,month,day,week[totalDays(day)%7]);
	}
	
//	void days() {
//		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		// -1은 사용하지 않겠다라는 의미. index가 각 월을 뜻하게 하려고 넣음. monthLastDays[1] = 1월 .... monthLastDays[12] = 12월
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			monthLastDays[2] = 29;
//		}
//	}
}
