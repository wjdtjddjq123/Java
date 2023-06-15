package chap07.terran;

public class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitpoint = MAX_HP;
	}
	void repira(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitpoint!=u.MAX_HP) {
				u.hitpoint++;
			}
		}
	}
}
