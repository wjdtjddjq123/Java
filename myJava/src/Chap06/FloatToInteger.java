package Chap06;
// �ʵ��뿹��
public class FloatToInteger {
	double num;
//	FloatToInteger(){}
	void setNum(double a) {
		num = a;
//		����� �Է� �� �޴� ��
	}
	int floor() {
//		����
		return(int)num;
	}
	int round() {
		return(int)(num+0.5);
//		�ݿø�
	}
	int ceil() {
		int result =0;
//		�ø�
		if(num == (int)num) {
			result = (int)num;
		}else {
			result = (int)(num+1);
		}
		return result;
	}
}
