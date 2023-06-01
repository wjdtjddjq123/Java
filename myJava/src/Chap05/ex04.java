package Chap05;

// 입력받은 점수 중 제일 높은 점수와 제일 낮은 점수 출력
// 배열을 활용하는 좋은예제
// 첫번쨰 > 두번째 값과 비교
public class ex04 {
	
	public static void main(String[] args) {
		int [] scores = {80,75,60,85,100,60};
		
		int maxScore, minScore;
//		최고점, 최저점 변수 선언
		
		minScore = scores[0]; // 첫번쨰 점수가 최저점이라 가정 
		maxScore = scores[0]; // 첫번째 점수가 최고점이라 가정
		
		for(int i =1; i <scores.length; i++ ) {
			if(minScore<scores[i]) {
				minScore = scores[i];
//				변수에 배열 비교 한 내용 삽입.
			}
			if(maxScore>scores[i]) {
				maxScore = scores[i];
//				변수에 배열 비교 한 내용 삽입
			}
		}System.out.printf("최고점수 : %d, 최저점수:%d \n", maxScore, minScore );
		
	}
}
