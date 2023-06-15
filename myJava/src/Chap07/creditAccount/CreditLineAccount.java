package chap07.creditAccount;

public class CreditLineAccount extends Account {

	int creditline; // �ſ��ѵ�, ���̳ʽ�����
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
