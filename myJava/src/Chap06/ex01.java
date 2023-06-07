package Chap06;

public class ex01 {
	public static void main(String[] args) {
		
//		향상된 for문을 사용하여 모든 과일을 출력하는 코드를 작성하세요.		
		String [] fruits = {"사과","딸기","바나나","복숭아","파인애플"};
		
		for(String num : fruits) {
			System.out.print(num+"  ");
		}
		
//		for(int i=0; i<fruits.length;i++) {
//			System.out.print(fruits[i]+"  ");
//		}

			
	/*	int[] lotto = new int[6];
		
		lotto[0] = 7;
		lotto[1] = 12;
		lotto[2] = 29;
		lotto[3] = 38;
		lotto[4] = 42;
		lotto[5] = 48;
		
		for( int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"  ");
		}
		
		for(int num :lotto) {
		배열 또는 자바에서 제공하는 자료구조 클래스 등 컬렉션 개체가 콜론 뒤에 올 수 있다.
		collenction이 오면 반복변수에 순서대로 저장 됨
			System.out.print(num+"  ");
		}
		}*/
	}
}