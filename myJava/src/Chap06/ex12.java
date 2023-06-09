package Chap06;
/* 오버로딩 */
public class ex12 {
	public static void main(String[] args) {
		FloatToInteger2 fti1, fti2;
		double num1 = 3.6, num2 = 3.4;
		
		fti1 = new FloatToInteger2();
		fti1.setNum(num1);
//		(디폴트 생성자 사용)첫번째 생성자를 이용해서 인스턴스 만듦
//		setNum을 호출해서 적절한 값을 넘겨줌
		fti2 = new FloatToInteger2();
//		두번째 생성자를 이용해서 인스턴스 만듦, 값을 넣어주었기 때문에 만들어질 때 부터 3.4라는값을 가짐
//		처음부터 내가 원하는 값을 넣어줄 수 있다.
		System.out.println("\t 버림: "+fti1.floor());
		System.out.println("\t 반올림: "+fti1.round());
		System.out.println("\t 올림: "+fti1.ceil());
		System.out.println("==============================");
		System.out.println("\t 버림: "+fti2.floor());
		System.out.println("\t 반올림: "+fti2.round());
		System.out.println("\t 올림: "+fti2.ceil());
	}
}
	