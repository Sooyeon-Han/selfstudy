package java_bible.ch07;

import static java.lang.System.out;
import static java.lang.Math.*;

public class ex11 {
	public static void main(String[] args) {
		/*
		static import문을 사용하면 static 멤버를 호출할 떄 클래스 이름을 생략할 수 있음
		 */
		//System.out.println(Math.random());
		out.println(random());
		
		//System.out.println("Math.PI : "+Math.PI);
		out.println("Math.PI : "+PI);
	}
}
