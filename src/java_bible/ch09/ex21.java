package java_bible.ch09;

import static java.lang.Math.*;
import static java.lang.System.*;

public class ex21 {
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		out.println("i = "+i);
		out.println("-i = "+(-i));
		
		try {
			out.printf("negateExact(%d) = %d%n", 10, negateExact(10));
			out.printf("negateExact(%d) = %d%n", -10, negateExact(10));
			out.printf("negateExact(%d) = %d%n", i, negateExact(i));	//μμΈλ°μ
		} catch (ArithmeticException e) {
			// TODO: handle exception
			out.printf("negateExact(%d) = %d%n",(long)i, negateExact((long)i));
		}
	}
}
