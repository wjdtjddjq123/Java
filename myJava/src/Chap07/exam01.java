package chap07;
import java.util.Scanner;
public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		exam01_Class cleandal;
		int year, month, day;
		
		System.out.println("��, ��, ��� �Է��ϼ���:");

		System.out.println("³â, ¿ù, ÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä:");
		int year,month,day;

		year = cleandal.year = sc.nextInt();
		month = cleandal.month = sc.nextInt();
		day = cleandal.day = sc.nextInt();


		year = sc.nextInt();
		month = sc.nextInt();
		day =  sc.nextInt();
		
		cleandal = new exam01_Class(year, month, day);
		

		cleandal.claender(year, month, day);

		cleandal.gettotalDays(day);

		cleandal.totalDays(day);

		
		

		sc.close();
		
		System.out.printf("�Է��Ͻ� %d�� %d�� %d��� %s���� �Դϴ�.", 
				year,month,day,cleandal.getDayOfWeek());
	}
}
