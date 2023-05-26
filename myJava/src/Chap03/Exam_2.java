package Chap03;
import java.util.Scanner;
public class Exam_2 {
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
		System.out.print(" 지급할 금액을 입력하세요: ");
		price = input.nextInt();
		
		System.out.print(" 구매하실 금액을 입력하세요: ");		
		price -= input.nextInt();
		
		System.out.printf("\n\t거스름돈 입니다 : %d", price);


		price %= 500;
		System.out.print("\t\n500원코인: %d개"+price/500);
		
		price %= 100;
		System.out.print("\t\n100원코인: %d개"+price/100);
		
		price %= 50;
		System.out.print("\t\n50원코인: %d개"+price/50);
		
		price %= 10;
		System.out.print("\t\n0원코인: %d개"+price/10);
	
		System.out.print("나머지: %d개 "+price);
		
//		int coin_500_1 = num % 500;
//		int cont_500_2 = num / 500;
////		System.out.print(coin_500_1);
//		System.out.print("500원코인 개수:" + cont_500_2+"\n");
//		
//		int coin_100_1 = coin_500_1 % 100;
//		int cont_100_2 = coin_500_1 / 100;
////		System.out.print(coin_100_1);
//		System.out.print("100원코인 개수:" + cont_100_2+"\n");
////		
//		int coin_50_1 = coin_100_1 % 50;
//		int cont_50_2 = coin_100_1 / 50;
////		System.out.print(coin_100_1);
//		System.out.print("50원코인 개수:" + cont_50_2+"\n");
//		
//		int coin_10_1 = coin_50_1 % 10;
//		int cont_10_2 = coin_50_1 / 10;
////		System.out.print(coin_10_1);
//		System.out.print("10원코인 개수:" + cont_10_2+"\n"+"나머지: "+ coin_10_1);
		
		input.close();
		

//		System.out.println("거스름 돈 : " + c);
//		System.out.println("500원 짜리 동전 : " + c/500 + "개");
//		System.out.println("100원 짜리 동전 : " + (c % 500)/100 +"개");
//		System.out.println("50원 짜리 동전  : " + ((c % 500) % 100)/50 + "개");
//		System.out.println("10원 짜리 동전  : " + (((c % 500) % 100) % 50) /10+ "개");
//		System.out.println("나머지 거스름 돈 : " + ((((c % 500) % 100) % 50)) % 10 + "원");
	}
}
