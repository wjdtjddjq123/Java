package Chap06;

public class RPS_2 {
	
	int user;
	int com;
	String [] kkb;
	
	RPS_2(){
		this.kkb = new String[] {"가위","바위","보"};
	}
	
	RPS_2(int user){
		this();
		this.setUser(user);
		this.setCom();
	}
	void setUser(int user) {
//		사용자선택 초기화
		this.user = user - 1;
	}
	void setCom() {
//		컴퓨터선택 초기화
		this.com =(int)(Math.random()*3);
	}
	String getUser() {
//		사용자 선택 문자열 반환
		return this.kkb[this.user]; 
	}
	String getCom() {
//		컴퓨터 선택 문자열 반환
		return this.kkb[this.com]; 
	}
	String judge() {
//		판정
		String result ="";
		
		switch(user - com) {
		case 0: result = "비겼습니다."; break;
		case 1: case-2: result ="이겼습니다."; break;
		case -1: case 2: result ="졌습니다"; break;
		}
		return result;
	}
}

