package chap07.terran;

public class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitpoint = MAX_HP;
	}
	
	@Override
//	������̼� - �����Ϸ����� ��Ʈ���ִ� ������̼� 
	public String toString() {
		return "Tank";
	}
}
