package Chap06;

public class ex02 {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};
		
		for(int num : arr1 ) {
			num = num * 2 ;
//			num 변수는 복사한 값, 복사해서 가지고 있는 배열 변수의 값을 바꿔도 원래 배열은 안 바뀜.
//			복사한 값 저장 
		}
		
		for(int i=0; i<arr2.length; i++ ) {
			arr2[i] = arr2[i]* 2;			
//			num 변수는 복사한 값, 복사해서 가지고 있는 배열 변수의 값을 바꿔도 원래 배열은 안 바뀜.
//			원래 배열의 값을 직접 변경하는 것
		}
		for(int num : arr2 ) {
			System.out.print(num+"  ");
		}
	}		
}