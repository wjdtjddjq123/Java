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
//		���۷����� ȣ���ϰԵǸ� To String �޼��带 �ڵ����� ȣ���ϰ� ��
//		�׷��� �Ǹ�?
//		�׷��� �� �Ǹ�? �ڹ� �����ӽſ��� �ش� ���۷����� ������ ��ü�� �ĺ� ���̵� ���� ��� ��.
		

	}
}