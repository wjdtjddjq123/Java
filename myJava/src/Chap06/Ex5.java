package chap06;

public class Ex5 {

	public static void main(String[] args) {
		//noReturn() �޼��带 ȣ���Ͽ� �����ϴ� �ڵ带 �ۼ��ϼ���.
		 ReturnTest test = new ReturnTest();
		 test.noReturn();
		 test.return1();
		 // String returnvalue = test.return2();
		// System.out.println("returnvalue: " + returnvalue);
		 System.out.println("returnvalue: " + test.return2());
		}

	}


