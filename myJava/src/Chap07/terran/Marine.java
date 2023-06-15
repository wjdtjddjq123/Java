package chap07.terran;

public class Marine extends GroundUnit implements Repairable{
	Marine(){
		super(40);
		hitpoint = MAX_HP;
	}
	
}