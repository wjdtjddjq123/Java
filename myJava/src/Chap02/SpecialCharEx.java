package Chap02;


class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\'');		     //  ''' 처럼 사용할 수 없다.
		System.out.println("abc\t123\b456"); //  \t = Tap , \b = backspace  3이 지워짐 
		System.out.println('\n');		     //  개행
		System.out.println("\"Hello\"");	 //  큰 따옴표를 출력할 수 없다.
		System.out.println("c:\\");			 //  역슬래쉬 자체 출력
	}
}
