package chap07;

import java.lang.reflect.Array;
import java.util.Arrays;

//import java.lang.reflect.Array;

/*
 * ���� �迭�� �̿��Ͽ� �ߺ����� �ʴ� �ζ� ��ȣ 6���� �����Ͽ� ũ�� ������� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * ��, ��ü���������� �ڵ带 �ۼ��Ͽ��� �մϴ�.
 * 
 * int [] lotto = new int[6];
 * */
public class exam02 {
	public static void main(String[] args) {
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
