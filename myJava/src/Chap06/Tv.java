package chap06;

class Tv {
	
	String color;
	boolean isPower;
	int channel;
	
	void setPower() {
		isPower = !isPower;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}

}
