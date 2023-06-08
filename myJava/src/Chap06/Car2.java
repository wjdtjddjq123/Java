package Chap06;

public class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(String gearType, String color, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("첫번째 생성자");
		
		/*  
		생성자 안에서 초기화하는 작업	
		2, 3, 4번쨰 생성자들이 1번째 생성자에게 값을 넘기고 있음.
		여기서 초기화
		멤버변수 이용하는 클래스  
		*/
	}	

//		여기서 부터 생성자, 객체사용
	Car2(){
		/* 
		자기 클래스 안에 있는 다른 생성자를 호출하는 문장
		this()는 생성자 안에서 가장 첫번째 문장이어야 함. 
		*/
		this("black","auto", 4);
		System.out.println("두번째 생성자");
	}
	Car2(String color){
		this("color","auto", 4);
		System.out.println("세번째 생성자");
	}
	Car2(String gearType, String color){
		this("color","gearType", 4);
		System.out.println("네번째 생성자");
	}
	Car2(Car2 car2){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("다섯번째 생성자");
	}	
	
}
