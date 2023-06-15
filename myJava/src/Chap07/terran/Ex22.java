package chap07.terran;
public class Ex22 {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repira(tank);
		if(marine instanceof Repairable) {
			scv.repira(marine);	
		}
	}
}
