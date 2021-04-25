package java_bible.ch08;

public class ex14 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main 메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}	//main 메서드 끝
	
	static void method1() throws Exception{
		throw new Exception();
	}	//method1() 끝
}	//class 끝

