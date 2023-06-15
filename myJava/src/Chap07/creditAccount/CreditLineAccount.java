package chap07.creditAccount;

public class CreditLineAccount extends Account {

	int creditline; // 신용한도, 마이너스통장
	CreditLineAccount(int creditLine){
		this.creditline = creditLine;
	}
	
	int withdraw(int amount) {
		if(amount>(balance+creditline)) {
			amount = -1;
		}
		else {
			balance -= amount;
		}
		return amount;
	}
}
