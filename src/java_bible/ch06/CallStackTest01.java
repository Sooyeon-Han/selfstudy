package java_bible.ch06;

public class CallStackTest01 {
	public static void main(String[] args) {
		firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
