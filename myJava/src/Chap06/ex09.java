package Chap06;
public class ex09 {
	
	void changeRefParam(int [] Arr) {
//		Param_Arr = �Ű����� ( ���� �޼����� �ּҰ��� �����ؼ� Param_Arr�� �Ѱ��ִ� �� )
//		2�� ��Ű��
		for(int i=0; i< Arr.length; i++) {
//		�ϳ� �� 2�� ��Ű��
			Arr[i] *= 2;
		}
//		2�� Ȯ��
		System.out.print("changeRefParam() arr[]: ");
		for(int i=0; i<Arr.length; i++) {
//		�ٽ� �ϳ� �� Ȯ��
			System.out.print(Arr[i]+"   ");
		}
	}
	
//	�⺻�ڷ��� ������ �ѱ�� ��ü�� ���� 
//	call by Reference : ���۷����� �ѱ�� �Ǹ� �ϳ��� ��ü�� �ΰ��� ���۷����� ����Ű�Եȴ�. ��, ���� ��ü�� ����Ű�� ���۷����� ��ü ���� �ٲ�� �ȴ�.

	public static void main(String[] args) {
		ex09 a = new ex09();
		int [] Arr = {1,2,3,4,5};
		System.out.print("   �޼��� ȣ�� �� arr[]: ");
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+"   ");
		}
//		����
		System.out.println(" ");
		a.changeRefParam(Arr);
		
		System.out.print("\n   �޼��� ȣ�� �� arr[]: ");
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+"   ");
		}
	}
}
	