package Chap06;

public class TvTest {
	public static void main(String[] args) {
		Tv t1,t2;
		t1 = new Tv();
		t2 = new Tv();
		
		System.out.println("color  "+ t1.color);
		System.out.println("isPower  "+ t1.isPower);
		System.out.println("channel  \n" +t1.channel);
		
		System.out.println("color  "+ t2.color);
		System.out.println("isPower  "+ t2.isPower);
		System.out.println("channel  \n" +t2.channel);
		
		System.out.println("t1: "+t1+"\t t2: "+t2);
//		레퍼런스를 호출하게되면 To String 메서드를 자동으로 호출하게 됨
//		그렇게 되면?
//		그렇게 안 되면? 자바 머츄얼머신에서 해당 레퍼런스가 가지는 객체의 식별 아이디 값이 출력 됨.
		

	}
}