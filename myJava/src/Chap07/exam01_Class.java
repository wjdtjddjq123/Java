package chap07;

public class exam01_Class {
	
	int year;
	int month;
	int day;
	
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
	}
	
//	void days() {
//		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		// -1�� ������� �ʰڴٶ�� �ǹ�. index�� �� ���� ���ϰ� �Ϸ��� ����. monthLastDays[1] = 1�� .... monthLastDays[12] = 12��
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			monthLastDays[2] = 29;
//		}
//	}
}
