package java_bible.ch08;

public class ex20 {
	public static void main(String[] args) {
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(false);	//예외가 발생하지 않는다.
		} catch (WorkException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true);	//예외가 발생
		}catch(WorkException e) {
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
	}	//main의 끝
}

class CloseableResource implements AutoCloseable{
	public void exceptionWork(boolean exception) throws WorkException{
		System.out.println("exceptionWork("+exception+")가 호출됨");
		
		if(exception)
			throw new WorkException("WorkException 발생!");
	}
	
	public void close() throws CloseException{
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException 발생!");
	}
}

class WorkException extends Exception{
	WorkException(String msg){super(msg);}
}

class CloseException extends Exception{
	CloseException(String msg){super(msg);}
}
