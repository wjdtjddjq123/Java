package oop;

public class Test03 {
	public static void main(String[] args) {
		
//		���� : Time [] arr;
//		���� :	arr = new Time[3];
//		�ʱ�ȭ : 	arr[0] = new Time();
//		����+���� :	Time [] arr = new Time[3];
//		����+����+�ʱ�ȭ
		Time [] arr = {new Time(),new Time(),new Time()};

		 arr[0].hour=10; arr[0].minute= 44; arr[0].second= 35;
		 arr[1].hour=11; arr[1].minute= 24; arr[1].second= 1;
		 arr[2].hour=12; arr[2].minute= 14; arr[2].second= 59;

		for(Time i : arr) {
			System.out.println(i.getCurrntTime());
			}
			
		
		
		
		/*
		 Time [] arr = {
					new Time(),
					new Time(),
					new Time(),
					new Time(),
					new Time()};		 

		 arr[0].hour=10; arr[0].minute= 44; arr[0].second= 35;
		 arr[1].hour=11; arr[1].minute= 24; arr[1].second= 1;
		 arr[2].hour=12; arr[2].minute= 14; arr[2].second= 59;
		 arr[3].hour=15; arr[3].minute= 51; arr[3].second= 8;
		 arr[4].hour=20; arr[4].minute= 38; arr[4].second= 18;
		 
		for(Time i : arr) {
			
			System.out.println(i.getCurrntTime());
			}
			
	
		
		 ��������ʱ�ȭ �ѹ���
		 Time [] arr = {
				new Time(),new Time(),new Time(),
				new Time(),new Time()};
				

		
	
		����, ����, �ʱ�ȭ ���ε���
		Time [] arr = new Time [5];
		arr[0] = new Time();
		arr[1] = new Time();
		arr[2] = new Time();
		arr[3] = new Time();
		arr[4] = new Time();
		
		*/
		
		
		
		

		
		/*
		int [] arr = new int [5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i : arr) {
			System.out.println(arr[i]);
		}*/
	}
}
