package java_bible.ch08;

public class ex21 {
	public static void main(String[] args) {
		try {
			startInstall();	//프로그램 설치에 필요한 준비를 한다
			copyFiles();
		} catch (SpaceException e) {
			// TODO: handle exception
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {
			// TODO: handle exception
			System.out.println("에러 메세지 : "+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles();	//프로그램 설치에 사용된 임시 파일들을 삭제
		}	//try
	}	//main
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())	//충분한 설치 공간이 없으면
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())	//충분한 메모리가 없으면
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드
		return false;
	}
	
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리 공간이 있는지 확인하는 코드
		return true;
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}
