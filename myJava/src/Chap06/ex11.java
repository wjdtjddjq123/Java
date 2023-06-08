package Chap06;
/* 오버로딩 */
public class ex11 {
	
	int add(int num1, int num2) {
		return num1+num2;
	}
//	int add (int a, int b) {
//		return a+b;
//	}
//	long add (int a, int b) {
//		return a+b;
//	}
	
	double add(double num1, double num2) {
		return num1+num2;
	}
	
	int add (int [] arr) {
		int total = 0;
		for(int num:arr) {
			total+=num;
		}
		return total;
	}
	public static void main(String[] args) {
		ex11 ex11 = new ex11();
		
		System.out.println("ex11.add(3,4) = "+ex11.add(3,4));
		System.out.println("ex11.add(3.5,4.2) = "+ex11.add(3.5,4.2));
		System.out.println("ex11.add(new int[] {1,2,3,4,5}) = "+
							ex11.add(new int[] {1,2,3,4,5}));
	}
}
	