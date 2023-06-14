package oop;

public class Test02 {
	public static void main(String[] args) {
		Time TC = new Time();
		
		System.out.println(TC.getCurrntTime());
		TC.hour = 10;
		TC.minute = 40;
		TC.second = 40;
		
		System.out.println(TC.getCurrntTime());
	}
}
