package oop;
/* ���۷��� �迭 example */
public class Time {
	//���۷����迭 : �������� ���۷��� �ּڰ��� ������ ��
	int hour;
	int minute;
	int second;
	
	String getCurrntTime() {
//		��ȯ�� �ϱ⶧���� ����� ���� �����־�� ��.
		return this.hour+"�� "+this.minute+"�� "+this.second+"�� ";
	}
}
