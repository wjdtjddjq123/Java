package chap07.Star;

public class Dropship extends Unit {
	
	Dropship(int x, int y){
		super(x,y);
	}
	
	void move(int x, int y){
		System.out.println("���ۼ���"+x+","+y+"��ġ�� �̵��մϴ�.");
	}
	
	void load() {
		System.out.println("���ۼ��� ������ �¿�ϴ�.");
	}
	void unload() {
		System.out.println("���ۼ��� ������ �����ϴ�.");
	}
}
