package java_bible.ch08;

public class ex07 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
