package Chap06;
public class ex09 {
	
	void changeRefParam(int [] Arr) {
//		Param_Arr = 매개변수 ( 메인 메서드의 주소값을 복사해서 Param_Arr에 넘겨주는 것 )
//		2배 시키기
		for(int i=0; i< Arr.length; i++) {
//		하나 씩 2배 시키기
			Arr[i] *= 2;
		}
//		2배 확인
		System.out.print("changeRefParam() arr[]: ");
		for(int i=0; i<Arr.length; i++) {
//		다시 하나 씩 확인
			System.out.print(Arr[i]+"   ");
		}
	}
	
//	기본자료형 구조를 넘기면 객체의 값을 
//	call by Reference : 레퍼런스를 넘기게 되면 하나의 객체를 두개의 레퍼런스가 가르키게된다. 즉, 동일 객체를 가르키는 레퍼런스의 객체 값이 바뀌게 된다.

	public static void main(String[] args) {
		ex09 a = new ex09();
		int [] Arr = {1,2,3,4,5};
		System.out.print("   메서드 호출 전 arr[]: ");
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+"   ");
		}
//		개행
		System.out.println(" ");
		a.changeRefParam(Arr);
		
		System.out.print("\n   메서드 호출 후 arr[]: ");
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+"   ");
		}
	}
}
	