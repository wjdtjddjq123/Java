package Chap06;

public class RPS_2 {
	
	int user;
	int com;
	String [] kkb;
	
	RPS_2(){
		this.kkb = new String[] {"����","����","��"};
	}
	
	RPS_2(int user){
		this();
		this.setUser(user);
		this.setCom();
	}
	void setUser(int user) {
//		����ڼ��� �ʱ�ȭ
		this.user = user - 1;
	}
	void setCom() {
//		��ǻ�ͼ��� �ʱ�ȭ
		this.com =(int)(Math.random()*3);
	}
	String getUser() {
//		����� ���� ���ڿ� ��ȯ
		return this.kkb[this.user]; 
	}
	String getCom() {
//		��ǻ�� ���� ���ڿ� ��ȯ
		return this.kkb[this.com]; 
	}
	String judge() {
//		����
		String result ="";
		
		switch(user - com) {
		case 0: result = "�����ϴ�."; break;
		case 1: case-2: result ="�̰���ϴ�."; break;
		case -1: case 2: result ="�����ϴ�"; break;
		}
		return result;
	}
}

