package chap04;
import java.util.Scanner;

public class Exam06{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int year ;
			
			String result = "";
			System.out.print("�⵵�� �Է��ϼ���:");
			year = sc.nextInt();
			sc.close();
			
			if (year % 400 == 0) {
				result = "����";
			} 
			else if (year % 100 == 0) {
				result = "���";
			}
			else if (year % 4 == 0) {
				result = "����";
			}
			else {
				result ="���";
			}
			
			System.out.printf("�Է��Ͻ� %d���� %s�Դϴ�.", year,result);
			
	}
}