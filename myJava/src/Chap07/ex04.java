package Chap07;
/* 오버라이딩 */
public class ex04 {

	public static void main(String[] args) {
		Child child = new Child("손흥민","남자");
		child.methodA();
		
		System.out.println(child.name+":"+child.gender);
	}
}
