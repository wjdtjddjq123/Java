package chap06;

public class FloatToInteger2 {
	double num;
	
	FloatToInteger2(){
		
	}
	
	FloatToInteger2(double num){
		this.num = num;
	}
	
	void setNum(double a) {
		this.num = a;
	}
	
	int floor() {
		return (int)this.num;
	}
	int round() {
		return (int)(this.num+0.5);
	}
	
	int ceil() {
		int result = 0;
		if((int)this.num == this.num) {
			result = (int)this.num;
		}
		else {
			result = (int)(this.num+1);
		}
		return result;
	}
}
