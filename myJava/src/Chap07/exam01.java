package chap07;
import java.util.Scanner;
public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		exam01_Class cleandal;
		int year, month, day;
		
		System.out.println("��, ��, ���� �Է��ϼ���:");

		year = sc.nextInt();
		month = sc.nextInt();
		day =  sc.nextInt();
		
		cleandal = new exam01_Class(year, month, day);
		
<<<<<<< Updated upstream
		cleandal.claender(year, month, day);
		cleandal.totalDays(day);
		
		
		
=======
		sc.close();
>>>>>>> Stashed changes
		
		System.out.printf("�Է��Ͻ� %d�� %d�� %d���� %s���� �Դϴ�.", 
				year,month,day,cleandal.getDayOfWeek());
	}
}
