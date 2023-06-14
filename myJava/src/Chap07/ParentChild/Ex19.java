package chap07.ParentChild;

public class Ex19 {

	public static void main(String[] args) {
		Parent3 p1, p2;
		p1 = new Parent3();
		p2 = new Child3();
		
		System.out.println("p1.num:"+p1.num);
		p1.methodA();
		
		System.out.println("p2.num:"+p2.num);
		p2.methodA();
		}
//		특별한 상황이 아니라면 필드를 중복해서 사용하지 않아야 한다.
}

