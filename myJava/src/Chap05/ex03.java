package Chap05;
import java.util.Scanner;

// 입력받은 점수 중 제일 높은 점수와 제일 낮은 점수 출력
// 첫번쨰 > 두번째 값과 비교
public class ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []stdscores;
		int stdcount, total=0;
		
		System.out.print("학생 수를 입력하세요:");
		stdcount = sc.nextInt();
		
		stdscores = new int [stdcount];
//		int[] max, min;
//		동적배열
		
		System.out.printf("%d 명의 학생들의 점수를 입력하세요:",stdscores.length);
		for(int i =0; i<stdscores.length; i++) {
			stdscores[i] = sc.nextInt(); // nextint를 반복문 안에다 사용하면 학생들의 점수를 바로 읽어 낼 수 있음.
			total+=stdscores[i];
		}
		sc.close();
//		System.out.println("\n[입력한 학생의 점수]");
//		for(int i =0; i<stdscores.length; i++) {
//			System.out.print(stdscores[i]+"");
//		}
		
		System.out.println("\n[입력한 학생의 평균]");
		for(int i =0; i<stdscores.length; i++) {
			System.out.print(stdscores[i]+"   ");
		}
		
		System.out.printf("\n 총점 %d, 평균:%.2f\n",total, (double)total / stdscores.length);
		
}
	}
