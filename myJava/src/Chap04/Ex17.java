package chap04;

public class Ex17 {
	public static void main(String[] args) {
		int total = 0;
		int i = 1;
//		
//		while(true) { 			// 무한반복
//			total += i;
//			
//			if(total > 1000 ) { // total 1000넘어가면 중지
//				
//				break;
//			}
//			i++;				// 1000이후 중지, i는 더 증가하지 않습니다.
//		}
//		
		for(;;i++) {			// 무한반복
				
			total += i;
				
			if(total > 1000 ) { // total 1000넘어가면 중지
			break;
			}			// 1000이후 중지, i는 더 증가하지 않습니다.
		
		System.out.printf("1 부터 %d 까지의 합은 %d 입니다.", i,total);
		}	
	}
}

