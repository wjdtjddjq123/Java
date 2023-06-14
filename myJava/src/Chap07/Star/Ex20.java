package chap07.Star;

public class Ex20 {
//유닛의  모든 기능을 수행하는 메서드
	void play(Unit unit) {
		unit.move(30, 40);
		
		if(unit instanceof Marine ) {
			Marine mar = (Marine)unit;
			mar.steampack();
		}else if(unit instanceof Tank ) {
			Tank tank = (Tank)unit;
			tank.changeMode();
		}else if(unit instanceof Dropship) {
			Dropship dropship =(Dropship)unit;
			dropship.load();
			dropship.unload();
		}
		unit.stop();
	}
	
	public static void main(String[] args) {
		Ex20 ex20 = new Ex20();
		
		Unit [] unit = new Unit[4];
		
		unit[0] = new Marine(10, 20);
		unit[1] = new Tank(10, 20);
		unit[2] = new Dropship(10, 20);
		unit[3] = new Marine(20, 40);
		
		for(Unit myUnit:unit) {
			ex20.play(myUnit);
//			if(myUnit instanceof Marine ) {
//				Marine mar = (Marine)myUnit;
//				mar.steampack();
//			}else if(myUnit instanceof Tank ) {
//				Tank tank = (Tank)myUnit;
//				tank.changeMode();
//			}else if(myUnit instanceof Dropship) {
//				Dropship dropship =(Dropship)myUnit;
//				dropship.load();
//				dropship.unload();
//			}
//			myUnit.stop();
		}
	}
//	추상클래스 타입의 레퍼런스
// play() 메서드를 이용해 유닛을 사용하는 코드를 작성하세요.
}
