package oop;

public class child4 extends parent3 {
	
	int num2;
	// 1. �θ��� �Ű������� ���� �ν��Ͻ��� ������ش�.
	// 2. �θ��� �Ű������� �ִ� �����ڸ� ȣ���Ѵ�.
	
	child4(int num1, int num2){
		super(num1); // Super�� ����ϱ� ���ؼ��� This�� ���� ������ �ȿ��� ù��° �����̾�� �Ѵ�.
//		�ڽ����� ������ �θ� ��������� ȣ���Ѵ� = Super()
		this.num2 = num2;
		System.out.println(" child3 class instance ���� ");
	}
}
