package java_bible.ch08;

public class ex03 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("0");
			}
		}
	}
}
