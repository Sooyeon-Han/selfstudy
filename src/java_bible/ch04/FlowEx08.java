package java_bible.ch04;

import java.util.Scanner;

public class FlowEx08 {
	public static void main(String[] args) {
		System.out.println("당신의 주민번호를 입력하세요. ex(011231-1111222) >");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char g = s.charAt(7);

		switch(g) {
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;
		case '1': case '3':
			System.out.println("당신은 남자입니다.");
			break;
		default : 
			System.out.println("유효하지 않은 번호입니다.");
		}
	}

}
