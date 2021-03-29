package java_bible.ch06;

public class CallStackTest02 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작됨");
		firstMethod();
		System.out.println("main(String[] args)이 시작됨");		
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작됨");
		secondMethod();
		System.out.println("firstMethod()이 끝남");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작됨");
		System.out.println("secondMethod()이 끝남");
	}
}
