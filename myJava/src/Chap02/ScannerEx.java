package Chap02;
import java.util.Scanner;    // 스캐너 Import 

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int math, eng;
		
		System.out.print("수학, 영어 점수를 입력하세요.");
		
		math = scanner.nextInt();
		eng = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf(" 수학점수: %d, 영어점수: %d" , math , eng );
		
	} 
}
