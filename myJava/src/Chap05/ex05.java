package Chap05;

// 로또번호 출력
public class ex05 {
	
	public static void main(String[] args) {
		int[] ball = new int[45];
//		ball변수에 45개의 배열을 선언
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;   // ball[0]에 1삽입 -> ball[0]= 0에서 ball[0]= 1 으로 변경
			
		}
			int num = 0;  // 두 값을 바꾸는데 사용되는 임시변수
			int copynum = 0; // 임의 값을 얻어 사용하는 임시 저장소
			

//			배열에 저장된 값이 잘 석이도록 충분히 큰 반복횟수를 지정한다.
//			배열의 첫 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
			
			for(int j = 0; j<100; j++) {
				 copynum = (int)(Math.random()*45); // 배열범위(0~44)의 임의의 값을 얻는다.
		
				 num = ball[0]; 			// 임시변수에 ball값 저장 1 ~ 45
				 ball[0] = ball[copynum];   // ball 값에 임의 값을 얻어 사용하는 임시저장소의 값을 저장
				 
				 // 값을 바꾸는 작업 : 스왑
				 ball[copynum] = num; 	  	// 임시저장소의 값을 임시변수에 저장.
			}
			
			for (int k = 0; k < 6; k++) {
				System.out.print(ball[k]+"  ");
			}
		}
		
		
	}
