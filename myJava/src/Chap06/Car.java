package chap06;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "black";
		gearType = "auto";
		door = 4;
	}
	
	Car(String color){
		this.color = color;
		gearType = "auto";
		door = 4;
	}
	
	Car(String color, String gearType){
		this.color = color;
		this.gearType = gearType;
		door = 4;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
}
