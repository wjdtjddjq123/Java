package chap06;
import java.util.Scanner;
/*
 앞에서 작성된 가위바위보 객체를 이용하여 사용자가 원할때 까지 가위바위보를 할 수 있는 코드를 작성하세요.
 */
public class Exam3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Kbb kbb = new Kbb();
		String input = "";
		String intro = "\n\t[ 가위바위보 게임 ] \n"
				+ "\n"
				+ "\t 1. 가위 \n"
				+ "\t 2. 바위 \n"
				+ "\t 3. 보 \n"
				+ "\t >>> ";
		
		while(true) {
			kbb.setCom();
			
			System.out.print(intro);
			kbb.setUser(sc.nextInt());
			
			System.out.printf("\t\n사용자: %s, 컴퓨터: %s" , kbb.getUser(), kbb.getCom());
			System.out.printf("결과 ===> %s\n" , kbb.judge());
			
			sc.nextLine();
			System.out.print("\n\t 종료하시려면 'q'를 입력하세요: ");
			input = sc.nextLine();
			
			if(input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')) { 
				break;
			}
		}
		sc.close();
		System.out.print("\n\t 이용해주셔서 감사합니다. 다음에 다시 만나요. \n");
		
	}
}


