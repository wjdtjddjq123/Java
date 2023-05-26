package Chap03;
import java.util.Scanner;
public class Exam_3 {
	public static void main(String[] args) {
/*
			[ 동전 교환 프로그램 ]
			다음의 실팽 결과와 같은 프로그램을 작성하세요.
			
			실행 결과 ] 
			계산하실 금액을 입력하세요 : 10,000원
			구매하신 금액을 입력하세요 : 6,234원
			
			거스름돈 : 3,766원
			
			500원 짜리 동전 : 7개
			100원 짜리 동전 : 2개
			50원	짜리 동전 : 1개
			10원 짜리 동전 : 1개
			나머지 거스름 돈 : 6원
			
			코드작성 조건 ]
			1. 여러개의 변수를 이용하여 문제를 해결합니다.
			2. 하나의 변수만 사용하여 문제를 해결합니다.
			3. 
*/
		Scanner input = new Scanner(System.in);
		
		int price;
		
		System.out.print("구매할 금액을입력하세요.");
		price = input.nextInt();
		
		System.out.print("지급할금액을 입력하세요. ");
		price -= input.nextInt();
		
		System.out.print(price);
		
		
		System.out.printf("\t 500원동전: %d개 \n" , price/500 );
		price %= 500;
		
		System.out.printf("\t 100원동전: %d개 \n" , price/100 );
		price %= 100;
		
		System.out.printf("\t 50원동전: %d개 \n" , price/50 );
		price %= 50;
		
		System.out.printf("\t 10원동전: %d개 \n" , price/10 );
		price %= 10;
		
		System.out.printf("\t 나머지: %d원 \n" , price );
		
		
		
		input.close();
		

//		System.out.println("거스름 돈 : " + c);
//		System.out.println("500원 짜리 동전 : " + c/500 + "개");
//		System.out.println("100원 짜리 동전 : " + (c % 500)/100 +"개");
//		System.out.println("50원 짜리 동전  : " + ((c % 500) % 100)/50 + "개");
//		System.out.println("10원 짜리 동전  : " + (((c % 500) % 100) % 50) /10+ "개");
//		System.out.println("나머지 거스름 돈 : " + ((((c % 500) % 100) % 50)) % 10 + "원");
	}
}
