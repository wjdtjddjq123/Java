package chap06;

public class TvTest {

	public static void main(String[] args) {
		Tv t = new Tv();
		
		System.out.println("color: " + t.color);
		System.out.println("isPower: " + t.isPower);
		System.out.println("channel: " + t.channel);
		
		
		t.setPower();
		t.color ="Àº»ö";
		t.channelUp();
		t.channelUp();
		t.channelUp();
		
		System.out.println("color: " + t.color);
		System.out.println("isPower: " + t.isPower);
		System.out.println("channel: " + t.channel);
		
	}

}
