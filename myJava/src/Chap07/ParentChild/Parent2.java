package chap07.ParentChild;

//public final class Parent2 {
public class Parent2 {
//	�ڽ��� ���� �� ���� ������ Ŭ����
	String name;
	
	Parent2(String name){
		this.name = name;
		System.out.println("Parent �ν��Ͻ� ����");
	}
//	final void methodA() {
	void methodA() {
		System.out.println("Parent Ŭ���� methodA()");
	}
	
}
