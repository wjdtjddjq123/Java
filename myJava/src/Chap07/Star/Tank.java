package chap07.Star;

public class Tank extends Unit{
	
	Tank(int x, int y){
		super(x,y);
	}
	void move(int x, int y){
		System.out.println("��ũ��"+x+","+y+"��ġ�� �̵��մϴ�.");
	}
	void changeMode() {
		System.out.println("�������� ����");
	}
}
