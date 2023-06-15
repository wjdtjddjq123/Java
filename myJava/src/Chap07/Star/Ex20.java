package chap07.Star;

public class Ex20 {
//������  ��� ����� �����ϴ� �޼���
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
//	�߻�Ŭ���� Ÿ���� ���۷���
// play() �޼��带 �̿��� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
}
