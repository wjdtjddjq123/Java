package chap06;

public class TvTest2 {

	public static void main(String[] args) {
		Tv t1, t2;
		t1 = new Tv();
		t2 = new Tv();
		// ���� �ٸ� ��ü
		
		System.out.println("[Tv1]color: " + t1.color);
		System.out.println("[Tv1]isPower: " + t1.isPower);
		System.out.println("[Tv1]channel: " + t1.channel);
		
		System.out.println("[Tv2]color: " + t2.color);
		System.out.println("[Tv2]isPower: " + t2.isPower);
		System.out.println("[Tv2]channel: " + t2.channel);

		System.out.println("t1: " + t1 + ", t2: " + t2);	// �ش� ���۷����� ����Ű�� ������ id���� ��µ�
		
		System.out.println("==============================================");
		t2 = t1;	// �ϳ��� ������ ��ü
		
		t1.setPower();
		t2.color ="����";
		t1.channelUp();
		t2.channelUp();
		t1.channelUp();
		
		System.out.println("[Tv1]color: " + t1.color);
		System.out.println("[Tv1]isPower: " + t1.isPower);
		System.out.println("[Tv1]channel: " + t1.channel);
		
		System.out.println("[Tv2]color: " + t2.color);
		System.out.println("[Tv2]isPower: " + t2.isPower);
		System.out.println("[Tv2]channel: " + t2.channel);
		
		System.out.println("t1: " + t1 + ", t2: " + t2);
	}

}
