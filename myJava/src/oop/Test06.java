package oop;
/*Time Ŭ���� �迭�� �Է����� �޾� ��� Ÿ�԰�ü�� ���� 0��0��0�ʷ� �ʱ�ȭ�ϴ� �ڵ带 �ۼ��ϼ���.*/
public class Test06 {
	
	void callbyvalue(int num) {
		num *= 2;
		System.out.println("call by value num :"+num);
	}
	
	void callbyRef() {
		Time t1 = new Time();
		Time [] arr = {new Time(),new Time(),new Time()};
		
		arr[0].hour=10; arr[0].minute= 44; arr[0].second= 35;
		arr[1].hour=11; arr[1].minute= 24; arr[1].second= 1;
		arr[2].hour=12; arr[2].minute= 14; arr[2].second= 59;
		System.out.println("callbyreference ȣ�� ��");
		
		for(Time i : arr) {
//			�迭��ü Ȯ�� ����
			System.out.println(i.getCurrntTime());
			}
		
		System.out.println("callbyreference ȣ�� ��");
		for(int i=0; i<arr.length; i++) {
//			�迭��ü Ȯ�� �ϸ鼭 ���� 0���� �ʱ�ȭ ����
			arr[i].hour=0;
			arr[i].minute=0;
			arr[i].second=0;
			
			System.out.println(arr[i].getCurrntTime());
			}
		
	}
	
	
	
	public static void main(String[] args) {
//		Time Ŭ���� �迭�� �Է����� ȣ���ϴ� callbyreference �޼��带 ȣ���ϴ� ������ �ۼ��غ�����.
		Test06 t6 = new Test06();
//		System.out.println("ȣ�� ��");
		t6.callbyRef();;
		
		/*
		int num = 4;
		Test6 t6 = new Test6();		
		t6.callbyvalue(num);*/
	}
}
