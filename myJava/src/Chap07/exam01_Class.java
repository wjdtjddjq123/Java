package chap07;

public class exam01_Class {
	
	private int year;
	private int month;
	private int day;
	
<<<<<<< Updated upstream
	int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// �� ���� �ϼ�
	String [] week = {"��", "��", "ȭ", "��", "��", "��", "��"};	
	
	int totalDays (int num) {
		for(int i = 1; i < year; i++) {
			// ����, ��� ��� �˰���
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				// ����
				num += 366;
			}
			else {
				// ���
				num += 365;
			}
		}
		// �ش� �⵵ ���� �ޱ����� �� �� ���ϱ�
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
		
		
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.", year,month,day,week[totalDays(day)%7]);
=======
	exam01_Class (int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
>>>>>>> Stashed changes
	}
	
//	���⿩�� �Ǵܸ޼���
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
//	������ ������ ���ڸ� ��ȯ�ϴ� �޼���
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
	
//	������ ��ȯ�ϴ� �޼���
	String getDayOfWeek() {
		String [] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		return week[this.gettoaldays()%7];
	}
	
	
//	int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// �� ���� �ϼ�
//	String [] week = {"��", "��", "ȭ", "��", "��", "��", "��"};	
//	
//	int gettotalDays (int num) {
//		for(int i = 1; i < year; i++) {
//			// ����, ��� ��� �˰���
//			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//				// ����
//				num += 366;
//			}
//			else {
//				// ���
//				num += 365;
//			}
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
//		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.", year,month,day,week[gettotalDays(day)%7]);
//	}
}
