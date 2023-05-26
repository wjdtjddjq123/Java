package Chap03;

public class Ex05 {
	public static void main(String[] args) {
		int num1 = 6, num2 = 4, result; // 6: 0110, 4: 0100
		boolean boo1 = false, boo2 = true, bResult;
		
		
//		result = num1 & num2; 			// & : Bit and Operator , result : 0100 
//		bResult = boo1 & boo2;			// & : Logical And Operator
		result = num1 | num2; 			// | : Bit and Operator , result : 0110 
		bResult = boo1 | boo2;			// | : Logical And Operator
	
		System.out.print("result: "+ result+", bResult: "+bResult);
//		&&,|| : 첫번째 피연산자가 True 일 때 뒤에 피연산자를 확인 할 필요가X 
//		& , | : 첫번째 피연산자가 True 일 때만 뒤에 피연산자를 확인 
		
		
	}

}
