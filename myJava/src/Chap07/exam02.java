package chap07;


import java.lang.reflect.Array;
import java.util.Arrays;

//import java.lang.reflect.Array;


/*
 * 다음 배열을 이용하여 중복되지 않는 로또 번호 6개를 생성하여 크기 순서대로 출력하는 코드를 작성하세요.
 * 단, 객체지향적으로 코드를 작성하여야 합니다.
 * 
 * int [] lotto = new int[6];
 * */
public class exam02 {
	public static void main(String[] args) {

		exam02_Class lotto = new exam02_Class();
	
		System.out.printf("로또번호 : %s",lotto.toString());

		int lotto [] = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)((Math.random()*45)+1);
			if(i != 0) {
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
					}
				}
				
			}
		}		
		for(int i=0; i < 6 ;i++) {
			System.out.printf("%d \t", lotto[i]);
		}
	}		
}
