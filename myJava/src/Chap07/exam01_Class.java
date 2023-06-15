package chap07;

public class exam01_Class {
	
	private int year;
	private int month;
	private int day;

	int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// �� ���� �ϼ�

	int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 각 월의 일수
	String [] week = {"일", "월", "화", "수", "목", "금", "토"};	

	

	int gettotalDays (int num) {

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
		

		System.out.printf("%d�� %d�� %d��� %s�����Դϴ�.", year,month,day,week[totalDays(day)%7]);

	exam01_Class (int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;

	}
	
//	��⿩�� �Ǵܸ޼���
	private boolean isleapYear() {
		return this.isleapYear(this.day);
	}
	
	boolean isleapYear(int year) {
		boolean result = false;
		if(year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
			result = true;
		}
	return result;
	}
//	������ ���� ���ڸ� ��ȯ�ϴ� �޼���
	private int getMountLastday(int month) {
		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(this.isleapYear()) {
			monthLastDays[2] =29;
		}
		return monthLastDays[month];
	}
//	���� 1�� 1�� 1�Ϻ��� ����ڰ� �Է��� ��¥ ������ ��ü �� �ϼ� ��ȯ�ϴ� �޼���
	private int gettoaldays() {
		int total = 0;
		for(int i=1; i<this.year; i++) {
			if(this.isleapYear(i)) {
				total += 366;
			}else {
				total += 365;
			}
		}
		for(int i=1; i<this.month; i++) {
			total += this.getMountLastday(i);
		}
		total += this.day;
		return total;
	}
	
//	����� ��ȯ�ϴ� �޼���
	String getDayOfWeek() {
		String [] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		return week[this.gettoaldays()%7];
	}
	
	
//	int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// �� ���� �ϼ�
//	String [] week = {"��", "��", "ȭ", "��", "��", "��", "��"};	
//	
//	int gettotalDays (int num) {
//		for(int i = 1; i < year; i++) {
//			// ���, ��� ��� �˰���
//			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//				// ���
//				num += 366;
//			}
//			else {
//				// ���
//				num += 365;
//			}


		System.out.printf("%d년 %d월 %d일은 %s요일입니다.", year,month,day,week[gettotalDays(day)%7]);
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.", year,month,day,week[totalDays(day)%7]);
}	


//	void days() {
//		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		// -1은 사용하지 않겠다라는 의미. index가 각 월을 뜻하게 하려고 넣음. monthLastDays[1] = 1월 .... monthLastDays[12] = 12월
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			monthLastDays[2] = 29;

//		}
//		// �ش� �⵵ ���� �ޱ����� �� �� ���ϱ�
//		for(int j = 1; j < month; j++) {
//			if(month == 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
//					monthLastDays[2] = 29;
//				}
//				else {
//				num += monthLastDays[j];
//				}
//		}
//		return num;
//	}
//	void claender(int year, int month, int day) {
//		this.year = year;
//		this.month = month;
//		this.day = day;
//		System.out.printf("%d�� %d�� %d��� %s�����Դϴ�.", year,month,day,week[gettotalDays(day)%7]);
//	}
}
