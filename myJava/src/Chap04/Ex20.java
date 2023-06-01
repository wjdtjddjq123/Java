package chap04;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("문자열을 입력하세요:");
//		input = sc.next();
		// 입력받은 데이터 중 앞 자리만 읽음
		input = sc.nextLine();
		// 입력받은 데이터 중 공백포함 다 읽음 , 엔터키가 있으면 종료
		// 버퍼를 비우고 진행해야 정상적으로 값을 읽을 수 있음.
		System.out.println("");
		sc.close();
		for(int i =0 ; i< input.length(); i++) {
			// length = 문자열을 구성하는 문자의 수를
			System.out.println(input.charAt(i));			
		}
	
	}
}