package Chap03;
class OperatorEx01 {
	public static void main(String args[]) {
		int i=5, result;
	      
// i=i+1; 과 같은 의미이다.  ++1;로 바꿔 써도 결과는 같다.
//		전위형: 선증가 후 연산 , 후미형 : 선연산 후 증가 
		
//		result = i++; 
//		System.out.println("i:"+i+", result:"+result);
//		i=5;		      // 결과를 비교하기 위해ㅔ i값을 다시 5로 변경

//		result = i--;	
//		System.out.println("i:"+i+", result:"+result);
//		i=5;		      // 후위형, 선연산 후 감소
		
//		result = ++i; // 전위형, i값을 1씩 증가
//		System.out.println("i:"+i+", result:"+result);
		
		result = --i; // 전위형, i값을 1씩 감소
		System.out.println("i:"+i+", result:"+result);
	}
}

/*
 * 후미형
 * 
 * */
 