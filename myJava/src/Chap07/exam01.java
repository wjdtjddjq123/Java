package chap07;
import java.util.Scanner;
public class exam01 {

	public static void main(String[] args) {
		
		exam01_Class cleandal = new exam01_Class();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년, 월, 일을 입력하세요:");
		int year,month,day;

		year = cleandal.year = sc.nextInt();
		month = cleandal.month = sc.nextInt();
		day = cleandal.day = sc.nextInt();

		
		
		cleandal.claender(year, month, day);
		cleandal.totalDays(day);
		
		
		
		
	}

}
