package oop;
/*  ����¹�� 3���� */
public class Class5 {
	String name;
	String gender;
	int age;
	String hobby;
	
//	this(), Super()�� ���� ���� �� ����.
	Class5(){	
	}
	Class5(String name, String gender, int age) {
		this(name,gender,age,null);
	}
	Class5(String name, String gender, int age,String hobby) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;				
	}
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.gender+"\t"+this.hobby+"\n";
	}
}

	
