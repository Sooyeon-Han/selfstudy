package java_bible.ch08;

public class ex05 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	//0을 0으로 나누어 고의로 ArithmeticException을 발생시킨다
			System.out.println(4);		//실행되지 않는다
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(5);
		}
		System.out.println(6);
	}
}
