package chap07;

import chap07.packageB.Child;

public class Ex06 {

	public static void main(String[] args) {

		
		
		 Child child = new Child(10,20,30,40);
		 System.out.println("result: " + child.getResult1());
//		chap07.packageB.child 클래스의 인스턴스르 
//		생성하고 result값을 출력하는 코드를 작성하세요.
//		만약, 안된다면 문제가 무엇인지 찾고 가장 제한적인 방법으로 그 문제를 해결하세요.
//		Child child = new Child(1,2,3,4);
//		System.out.println("child : "+child.getResult1());	

//		chap07.packageB.child 클래스의 인스턴스르 
//		생성하고 result값을 출력하는 코드를 작성하세요.
//		만약, 안된다면 문제가 무엇인지 찾고 가장 제한적인 방법으로 그 문제를 해결하세요.
		Child child = new Child(1,2,3,4);
		System.out.println("child : "+child.getResult1());	

	}
}
