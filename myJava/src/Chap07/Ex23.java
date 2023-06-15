package chap07;

public class Ex23 implements Yourinterface{
	
	public void abstractmathod() {
		System.out.println("abstractmathod");
	}
	public static void main(String[] args) {
		
//		Ex22 ex22 = new Ex22();
		Yourinterface you = new Ex23(); 
		System.out.println("num :" +Yourinterface.num);
	
		Yourinterface.staticmathod();
		you.defaultmethod();
	}
}
