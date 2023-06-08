package Chap06;
public class ex10 {
	
	int sum(int num) {
//		
		if( num == 1 ) {
//		num이 1일 때
			return 1;
//		1반환
		}
		return num+sum(num-1);
//		반환 받은 값 10 일때 9 더하기
//		9일때 8더하기... 1이 나올 때 까지 반복
//		
	}
	
	public static void main(String[] args) {
	
		ex10 sum = new ex10();
		System.out.print("total : " + sum.sum(10));
	}
}
	