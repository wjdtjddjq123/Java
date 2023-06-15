package chap07;

public interface Yourinterface {
	int num = 1234;
	static void staticmathod() {
		System.out.println("staticmathod");
	}
	default void defaultmethod() {
		System.out.println("defaultmethod()");
	}
	void abstractmathod();
}
