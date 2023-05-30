package chap04;
import java.util.Scanner;

public class Exam06{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int year ;
			
			String result = "";
			System.out.print("년도를 입력하세요:");
			year = sc.nextInt();
			sc.close();
			
			if (year % 400 == 0) {
				result = "윤년";
			} 
			else if (year % 100 == 0) {
				result = "평년";
			}
			else if (year % 4 == 0) {
				result = "윤년";
			}
			else {
				result ="평년";
			}
			
			System.out.printf("입력하신 %d년은 %s입니다.", year,result);
			
	}
}