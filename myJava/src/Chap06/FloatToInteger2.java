package Chap06;

public class FloatToInteger2 {
	double num;
	FloatToInteger2(){
//		�Ű������� ���� ����Ʈ ������
	}
//	FloatToInteger2(double num){
//		this.num = num;
////		���ú���(�Ű�����)�� �ʵ庯��(�ν��Ͻ� ����)�� �̸��� ���� �� �ִ�. ��, ���ú����� �켱 �����̴�.
////		new��� Ű����� �ν��Ͻ��� ����� �ڵ����� this��� ���۷����� �����ȴ�.
////		this ���۷����� �ڱ��ڽ��� ��ü�� ����Ų��.
////		Ŭ�����ȿ��� �ٸ�Ŭ��������� ����� ���� this.�� �ٿ��� �� ���� �ڱ� �ڽ��� �ʵ峪 �޼��带 �ǹ��ϱ� �����̴�.
////		this�� ���� �ν��Ͻ� ������ ���� �����ϱ����ؼ� ����ϴ� �Ű������� �̸��� �����ʵ�� ���� �Ȱ��� �����Ҽ� �ִ�.
////		this�� �ν��Ͻ��� ����� ������ �ڱ� �ڽ��� ������ �� ���� �����ϴ� ���۷����̴�.
////		������ 2��
//	}
	
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