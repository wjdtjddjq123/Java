package Chap06;

public class RPS {
	
	int user, com;
	int [] kkb = {0, 1, 2};
//	 
	void setUser(int a) {
		user = a;
	}
	void setCom(int a) {
		com = (int)Math.random()*3;;
	}	
//
	String Rps() {
		
		String result = "";
		
		for(int i=0; i<kkb.length; i++) {
			if( user - com == 0) {
				result = "���";
			}else if( user - com == -2 || user-com == 1) {
				result = "�̱�";
			}else{
				result = "����";
			}
		}
		return result;
	}
	
	boolean Rps2() {
		
		boolean result = true ;
		while(true) {
			if( user - com == 0) {
				result = false;
			}else if( user - com != -2 || user-com != 1) {
				result = false;
			}else {
				result = true;
			}
			return result;
	}
	}
}
