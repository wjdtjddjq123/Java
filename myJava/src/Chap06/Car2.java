package Chap06;

public class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(String gearType, String color, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("ù��° ������");
		
		/*  
		������ �ȿ��� �ʱ�ȭ�ϴ� �۾�	
		2, 3, 4���� �����ڵ��� 1��° �����ڿ��� ���� �ѱ�� ����.
		���⼭ �ʱ�ȭ
		������� �̿��ϴ� Ŭ����  
		*/
	}	

//		���⼭ ���� ������, ��ü���
	Car2(){
		/* 
		�ڱ� Ŭ���� �ȿ� �ִ� �ٸ� �����ڸ� ȣ���ϴ� ����
		this()�� ������ �ȿ��� ���� ù��° �����̾�� ��. 
		*/
		this("black","auto", 4);
		System.out.println("�ι�° ������");
	}
	Car2(String color){
		this("color","auto", 4);
		System.out.println("����° ������");
	}
	Car2(String gearType, String color){
		this("color","gearType", 4);
		System.out.println("�׹�° ������");
	}
	Car2(Car2 car2){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("�ټ���° ������");
	}	
	
}
