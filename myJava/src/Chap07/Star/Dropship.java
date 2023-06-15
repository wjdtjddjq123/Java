package chap07.Star;

public class Dropship extends Unit {
	
	Dropship(int x, int y){
		super(x,y);
	}
	
	void move(int x, int y){
		System.out.println("수송선이"+x+","+y+"위치로 이동합니다.");
	}
	
	void load() {
		System.out.println("수송선이 병력을 태웁니다.");
	}
	void unload() {
		System.out.println("수송선이 병력을 내립니다.");
	}
}
