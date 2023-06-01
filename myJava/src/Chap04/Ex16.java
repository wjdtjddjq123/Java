package chap04;

/* 
 * 1부터 100 까지의 합은 5050입니다. 그렇다면 1부터 몇 까지의 합이 최초로 1000을 초과하는 값일까요?
 * 그 결과를 계산하는 코드를 작성하세요
 * */


public class Ex16 {
	public static void main(String[] args) {
		for (int i = 0; i<100; i++) {
			System.out.println("i:"+i);
			
			if (i == 3) {
				break;
			}
			// i가 3일 때는 바깥에 있는 중첩 반복문은 실행되지않음.
			for (int j = 0; j < 100; j++) {
				System.out.println("\t j:"+j);
				if (j==2) {
					break;
				}
			}
		}
		
	}	
}

