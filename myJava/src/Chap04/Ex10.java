package chap04;


public class Ex10 {

	public static void main(String[] args) {		
		for (int i = 0; i < 4; i++) {
			System.out.printf("%d\n",i);
			/* 반복문에서 i - j - k 이런식으로 관습적으로 영어 알파벳 순서로 진행 
			 * 각 반복문의 역할을 아는 것이 가장 중요함. ( 어떤목적을 가지고 있느냐? 
			 */
			for(int j = 0; j<4; j++) {
				System.out.printf("    %d\n",j);
			}
		}
	}
}
