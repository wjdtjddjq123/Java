package chap07;
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
	}		
}
