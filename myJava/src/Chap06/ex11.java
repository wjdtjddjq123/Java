package chap06;

public class Ex11 {

	int add(int num1, int num2) {
		return num1+num2;
	}
	/*
	int add(int a, int b) {
		return a+b;
	}
	*/  //¾ÈµÅ´Â°Å
	
	/*
	long add(int a, int b) {
		return (long)a+b;
	}
	*/  //¾ÈµÅ´Â°Å
	
	double add(double num1, double num2) {
		return num1+num2;
	}
	
	int add(int [] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		return total;
	}
	
	public static void main(String[] args) {
		Ex11 ex11 = new Ex11();
		System.out.println("ex11.add(3,4): " + ex11.add(3,4));
		System.out.println("ex11.add(3.5,4.2): " + ex11.add(3.5,4.2));
		System.out.println("ex11.add(new int[] {1, 2, 3, 4, 5}): " + ex11.add(new int[] {1,2,3,4,5}));

	}

}
