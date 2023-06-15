package chap07;

import chap07.Interface.ImplClass;
import chap07.Interface.childInterface;

public class Ex21 {

	public static void main(String[] args) {
		ImplClass imple = new ImplClass(); 
			
		imple.mathodA();
		imple.mathodB();
		imple.mathodC();
		imple.mathodD();
		
		System.out.println("num:"+childInterface.num);
		
	}
}
