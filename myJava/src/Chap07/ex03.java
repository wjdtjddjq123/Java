package Chap07;
/* 오버라이딩 */
public class ex03 {

	public static void main(String[] args) {
		CraditLineAccount cAccount = new CraditLineAccount(5000000);
		
		cAccount.accountNo = "A1234";
		cAccount.name = "손흥민";
		cAccount.balance = 1000000;
		
		cAccount.deposit(500000);
		System.out.println("현재잔액:"+cAccount.balance);
		
		if(cAccount.withdraw(10000000) == -1 ) {
			System.out.println("잔액이부족합니다.");
			System.out.println("현재잔액은"+cAccount.balance);
		}else {
			System.out.println("현재잔액은"+cAccount.balance);
		}
	}
}
