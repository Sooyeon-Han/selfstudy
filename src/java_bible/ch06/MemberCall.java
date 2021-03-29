package java_bible.ch06;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv2;	에러. 클래스 변수는 인스턴스 변수처럼 사용할 수 없음
	static int cv2 = new MemberCall().iv;	//이렇게 객체를 생성하여 사용
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);	에러. 클래스 메서드에서 인스턴스 변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);	//인스턴스에선 인스턴스 변수 바로 사용가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();	에러. 클래스 메서드에서 인스턴스 메서드 호출할 수 없음
		MemberCall c = new MemberCall();
		c.instanceMethod1();	//인스턴스를 생성한 후에 호출 가능		
	}
	
	void instanceMethod2() {
		staticMethod1();	//인스턴스 메서드에서는 인스턴스 메서드와 클래스 메서드
		instanceMethod1();	//모두 인스턴스 생성 없이 바로 호출 가능
	}
}
