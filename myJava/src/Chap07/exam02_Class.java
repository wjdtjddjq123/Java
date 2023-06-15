package chap07;
public class exam02_Class {
	
	private int lotto [] ;
	
	public exam02_Class() {
		this.lotto = new int[6];
		this.setLotto();
		this.sortLotto();
	}
//	로또 번호 중복 검사 메서드
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
//	로또배열 초기화 메서드
	void setLotto() {
		int temp;
		for(int i=0; i<this.lotto.length;) {
//	여기서 i를 증가시키는 것이 아니라 중복검사를 할 떄 i를 증가시킨다.
			while(true) {
				temp = (int)(Math.random()*45)+1;
				if(this.isUnique(temp)) {
//	유일한 번호를 생성한 이 부분에서 i 값을 증가시켜주어야한다.
					lotto[i]=temp;
					i++;
					break;
				}
			}
		}
	}
//	배열정렬
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
}
