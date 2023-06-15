package oop;
/*Time 클래스 배열을 입력으로 받아 모든 타입객체의 값을 0시0분0초로 초기화하는 코드를 작성하세요.*/
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
		System.out.println("callbyreference 호출 전");
		
		for(Time i : arr) {
//			배열객체 확인 포문
			System.out.println(i.getCurrntTime());
			}
		
		System.out.println("callbyreference 호출 후");
		for(int i=0; i<arr.length; i++) {
//			배열객체 확인 하면서 값을 0으로 초기화 포문
			arr[i].hour=0;
			arr[i].minute=0;
			arr[i].second=0;
			
			System.out.println(arr[i].getCurrntTime());
			}
		
	}
	
	
	
	public static void main(String[] args) {
//		Time 클래스 배열을 입력으로 호출하는 callbyreference 메서드를 호출하는 문장을 작성해보세요.
		Test06 t6 = new Test06();
//		System.out.println("호출 후");
		t6.callbyRef();;
		
		/*
		int num = 4;
		Test6 t6 = new Test6();		
		t6.callbyvalue(num);*/
	}
}
