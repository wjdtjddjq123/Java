package Chap06;

public class ex03 {
	public static void main(String[] args) {
		Time [] timeArr = new Time[3];
//		��ü�� heap�̶�� �޸� ���� �ȿ� ���� �ٸ� �������� ����� ��
//		Time Calss - Null ������ �ʱ�ȭ �Ǿ� ��

		for(int i =0; i<timeArr.length; i++) {
			timeArr[i] = new Time();
		}
		
		timeArr[0].setHour(14); timeArr[0].setMinute(14); timeArr[0].setSecond(14); 
		timeArr[1].setHour(9); timeArr[1].setMinute(30); timeArr[1].setSecond(33);
		timeArr[2].setHour(19); timeArr[2].setMinute(42); timeArr[2].setSecond(40);
		
		
		int i = 0 ;
		for(Time time:timeArr) {
//		�迭 ����
//		ù��° �ݺ� : time, null �� ����, ù��° Ÿ�� ��ü ���� -> Ÿ�Ӻ����� �ּ� �� ����
//		�ι�° �ݺ� : time, null �� ����, �ι�° Ÿ�� ��ü ���� -> Ÿ�Ӻ����� �ּ� �� ����
//		�ݺ��� ������ ��ü �����,
			System.out.printf("time%d] %s \n ",i+1,timeArr[i].currentTime());
			i++;
	}
		
//		for(Time time:timeArr) {
//			�迭 ����
//			ù��° �ݺ� : time, null �� ����, ù��° Ÿ�� ��ü ���� -> Ÿ�Ӻ����� �ּ� �� ����
//			�ι�° �ݺ� : time, null �� ����, �ι�° Ÿ�� ��ü ���� -> Ÿ�Ӻ����� �ּ� �� ����
//			�ݺ��� ������ ��ü �����, 
//			time = new Time();
//		}
//		
//		for(int i =0; i<timeArr.length; i++) {
//			System.out.printf("time%d] %s \n ",i+1,timeArr[i].currentTime());	
//		}


		
		
		
		
	}
}