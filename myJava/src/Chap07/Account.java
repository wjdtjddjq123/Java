package Chap07;

public class Account {
	String accountNo;
	String name;
	int balance;
	
	void deposit(int amount) {
//		ют╠щ
		balance += amount;
	}
	
	int withdraw(int amount) {
		if(amount > balance) {
			amount = -1;
		}else {
			balance -= amount;
		}
		return amount;
	}
}
