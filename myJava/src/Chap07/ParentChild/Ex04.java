package chap07.ParentChild;

public class Ex04 {

	public static void main(String[] args) {
		Child child = new Child("¼ÕÈï¹Î", "³²ÀÚ");
		child.methodA();
		System.out.println(child.name + " : " + child.gender);
	}

}
