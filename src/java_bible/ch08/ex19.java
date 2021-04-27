package java_bible.ch08;

public class ex19 {
	public static void main(String[] args) {
		//method1()은 static 메서드이므로 인스턴스 생성없이 직접 호출이 가능하다
		ex19.method1();
		System.out.println("method1()의 수행을 마치고 main 메서드로 돌아왔습니다.");
	}	//main 메서드의 끝
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;	//현재 실행 중인 메서드를 종
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally 블럭이 실행되었습니다.");
		}
	}
}
