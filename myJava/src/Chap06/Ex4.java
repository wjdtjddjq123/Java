package chap06;

public class Ex4 {

	public static void main(String[] args) {
		{ // block scope 이 블록 벗어나면 사용불가능
			int num = 1234;
			System.out.println("num: " + num);
		}
		//System.out.println("num: " + num);//범위 벗어나서 num변수 사용 불가능
	}

}
