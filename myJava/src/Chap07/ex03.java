package Chap07;
/* �������̵� */
public class ex03 {

	public static void main(String[] args) {
		CraditLineAccount cAccount = new CraditLineAccount(5000000);
		
		cAccount.accountNo = "A1234";
		cAccount.name = "�����";
		cAccount.balance = 1000000;
		
		cAccount.deposit(500000);
		System.out.println("�����ܾ�:"+cAccount.balance);
		
		if(cAccount.withdraw(10000000) == -1 ) {
			System.out.println("�ܾ��̺����մϴ�.");
			System.out.println("�����ܾ���"+cAccount.balance);
		}else {
			System.out.println("�����ܾ���"+cAccount.balance);
		}
	}
}
