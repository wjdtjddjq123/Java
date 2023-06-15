package chap07.terran;

public class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitpoint = MAX_HP;
	}
	
	@Override
//	어노테이션 - 컴파일러에게 힌트를주는 어노테이션 
	public String toString() {
		return "Tank";
	}
}
