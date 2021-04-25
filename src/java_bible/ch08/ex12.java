package java_bible.ch08;

public class ex12 {
	public static void main(String[] args) throws Exception{
		method1();	//같은 클래스 내의 static 멤버이므로 객체 생성없이 직접 호출 가능
	}
	
	static void method1() throws Exception{
		method2();
		//method1 끝
	}
	
	static void method2() throws Exception{
		throw new Exception();
	}
}
