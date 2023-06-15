package chap07.Star;

public class Marine extends Unit{
	
	Marine(int x, int y){
		super(x,y);
	}
	void move(int x, int y){
		System.out.println("마린이"+x+","+y+"위치로 이동합니다.");
	}
	void steampack() {
		System.out.println("마린이 미쳤어요.");
	}
}
