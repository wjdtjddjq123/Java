package chap07.Star;

public class Marine extends Unit{
	
	Marine(int x, int y){
		super(x,y);
	}
	void move(int x, int y){
		System.out.println("������"+x+","+y+"��ġ�� �̵��մϴ�.");
	}
	void steampack() {
		System.out.println("������ ���ƾ��.");
	}
}
