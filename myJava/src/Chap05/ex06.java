package Chap05;

// �ζǹ�ȣ ���
public class ex06 {
	
	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = {
				"0000","0001","0010","0011",
				"0110","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111",};
		
		String result = "";
		for(int i=0; i< hex.length; i++) {
//			 hex�迭 index �� �ݺ���
			if(hex[i]>='0' && hex[i]<='9') {
//			hex �迭���� 0�̻��̰� 9�����̸� �Ʒ� �ڵ� ����
			result += binary[hex[i]-'0']; // '8' - '0' �� ����� 8
			
			System.out.println(result);
			}else {
				result += binary[hex[i]-'A'+10]; //'C'-'A'�� ����� 2
			}
		}
		
		System.out.println("hex:"+ new String(hex) );
		System.out.println("binary:"+result);
		
	}		
}

