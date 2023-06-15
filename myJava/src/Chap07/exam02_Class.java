package chap07;

public class exam02_Class {
	
	private int lotto [] ;
	
	public exam02_Class() {
		this.lotto = new int[6];
		this.setLotto();
		this.sortLotto();
	}
//	�ζ� ��ȣ �ߺ� �˻� �޼���
	boolean isUnique(int num) {
		boolean result = true ;
		
		for(int i=0; i<this.lotto.length;i++) {
			if(this.lotto[i]==num) {
				result = false;
				break;
			}
		}
		return result;
	}
//	�ζǹ迭 �ʱ�ȭ �޼���
	void setLotto() {
		int temp;
		for(int i=0; i<this.lotto.length;) {
//	���⼭ i�� ���Ű�� ���� �ƴ϶� �ߺ��˻縦 �� �� i�� ���Ų��.
			while(true) {
				temp = (int)(Math.random()*45)+1;
				if(this.isUnique(temp)) {
//	����� ��ȣ�� ���� �� �κп��� i ��� ������־���Ѵ�.
					lotto[i]=temp;
					i++;
					break;
				}
			}
		}
	}
//	�迭���
	void sortLotto() {
		int temp;
		for(int i=0; i<this.lotto.length-1;i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}
	
	int[] getLotto() {
		return lotto;
	}
	
	public String toString() {
		String result="";
		for(int num :lotto) {
			result += num+"\t";
		}
		return result;
	}
=======
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
