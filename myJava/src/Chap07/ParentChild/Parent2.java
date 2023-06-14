package chap07.ParentChild;

//public final class Parent2 {
public class Parent2 {
//	자식을 가질 수 없는 마지막 클래스
	String name;
	
	Parent2(String name){
		this.name = name;
		System.out.println("Parent 인스턴스 생성");
	}
//	final void methodA() {
	void methodA() {
		System.out.println("Parent 클래스 methodA()");
	}
	
}
