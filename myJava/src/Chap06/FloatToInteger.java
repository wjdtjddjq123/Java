package chap06;

/*
 ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
��, ��ü���������� �ڵ带 �ۼ��մϴ�.

������1]

�ϳ��� �Ǽ��� �Է��ϼ���: 3.64

����: 3
�ݿø�: 4
�ø�: 4
==========================================================

������2]

�ϳ��� �Ǽ��� �Է��ϼ���: 6.2364

����: 6
�ݿø�: 6
�ø�: 7
==========================================================

������ 3]

�ϳ��� �Ǽ��� �Է��ϼ���: 4.0

����: 4
�ݿø�: 4
�ø�: 4
*/

public class FloatToInteger {
	double num;
	
	FloatToInteger(){
		
	}//����Ʈ ������
	
	void setNum(double a) {
		num = a;
	}
	
	int floor() {
		return (int)num;
	}
	int round() {
		return (int)(num+0.5);
	}
	
	int ceil() {
		int result = 0;
		if((int)num == num) {
			result = (int)num;
		}
		else {
			result = (int)(num+1);
		}
		return result;
	}




}
	
/*
	double burimNum(double num) {
		num = (int)num;
		return num;
	}

	double bolimNum(double num) {
		num = (int)((num + 0.5));
		return num;
	}
	double olimNum(double num) {

		if(num==(int)(num)) {
			num = (int)num;
		}
		else {
		num = (int)((num + 1));
		}
		return num;
	}
}
*/