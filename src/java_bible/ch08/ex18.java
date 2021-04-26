package java_bible.ch08;

public class ex18 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			deleteTempFiles();			//프로그램 설치에 사용된 임시파일들을 삭제한다
		}	//try-catch의 끝
	}		//main의 끝
	
	static void startInstall() {
		/*프로그램 설치에 필요한 준비를 하는 코드 적는다*/
	}
	
	static void copyFiles() {/*파일들을 복사하는 코드를 적는다*/}
	static void deleteTempFiles() {/*임시 파일들을 삭제하는 코드를 적는다*/}
}
