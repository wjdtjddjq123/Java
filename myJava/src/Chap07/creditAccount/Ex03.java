package chap07.creditAccount;

public class Ex03 {

	public static void main(String[] args) {
		CreditLineAccount cAccount = new CreditLineAccount(5000000);
		cAccount.accountNo = "A1234";
		cAccount.name = "손흥민";
		cAccount.balance = 1000000;
		
		cAccount.deposit(500000);
		System.out.println("현재 잔액: " + cAccount.balance);
		
		cAccount.withdraw(2000000);
		
		if(cAccount.withdraw(2000000) == -1) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재 잔액: " + cAccount.balance);
			}
		System.out.println("현재 잔액: " + cAccount.balance);
		
		cAccount.withdraw(10000000);
		
		if(cAccount.withdraw(10000000) == -1) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재 잔액: " + cAccount.balance);
		}
		System.out.println("현재 잔액: " + cAccount.balance);
	}

}
