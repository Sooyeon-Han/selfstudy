package java_bible.ch07;

public class ex31 {
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;			//에러 : static 변수 선언 불가
		final static int CONST = 100;	//final static은 상수이므로 선언 가능
	}
	
	static class StaticInner{
		int iv=200;
		static int cv = 200;			//static 클래스만 static 멤버를 정의할 수 있음
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300;		//에러 : static 변수를 선언할 수 없음
			final static int CONST=300;	//final static은 상수이므로 선언 가능
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
