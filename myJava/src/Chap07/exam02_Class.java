package chap07;
import java.util.Arrays;
public class exam02_Class {
	private int lotto [] = new int[6];
	
	
	void lottocheck() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)((Math.random()*45)+1);
			i++;
			if(i != 0) {
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
					}
				}
			}
		}Arrays.sort(lotto);
	}
	
	
	
}
