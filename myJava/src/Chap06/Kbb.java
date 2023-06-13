package chap06;

public class Kbb {
	String [] kbb;
	int user;
	int com;
	
	Kbb(){
		this.kbb = new String[] {"가위", "바위", "보"};
	}
	
	Kbb(int user){
		this();
		this.setUser(user);
		this.setCom();
	}
	
	void setUser(int user) {
		this.user = user-1;
	}
	
	void setCom() {
		this.com = (int)Math.random()* 3;
			}
	
	String getUser() {
		return this.kbb[this.user];
	}
	String getCom() {
		return this.kbb[this.com];
	}
	
	String judge() {
		String result = "";
		switch(this.user-this.com) {
		case 0: result = "비겼습니다."; break;
		case 1: case -2: result = "이겼습니다."; break;
		case -1: case 2: result = "졌습니다."; break;
	}
		return result;
	}
	
}

