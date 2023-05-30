package chap04;


public class Ex07 {

	public static void main(String[] args) {		
		
		int i, total=0;
		for(i= 1; i<=10; i++) {
			total += i;
			System.out.printf("i : %d, total : %d\n",i,total);
		}
		System.out.printf("[for 반복문 이후 i : %d]", i);
//		i는 반복제어 변수 : 반복이 실행되고 종료될 수 있음.
	}
}
