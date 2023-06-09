package Chap07;

public class CraditLineAccount extends Account {
	int craditLine;
	
	CraditLineAccount(int craditLine){
		this.craditLine = craditLine;
	}

	int withdraw(int amount) {
		if(amount > (balance+craditLine)) {
			amount = -1;
		}else {
			balance -= amount;
		}
		return amount;
	}
	
}
