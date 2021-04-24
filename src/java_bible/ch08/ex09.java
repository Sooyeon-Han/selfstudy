package java_bible.ch08;

public class ex09 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;		//예외를 발생시킴
			//throw new Exception("고의로 발생시킴");	위의 두 줄을 이렇게 한 줄로 줄일 수 있다
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료됨.");
	}
}
