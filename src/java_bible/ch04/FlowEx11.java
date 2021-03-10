package java_bible.ch04;

import java.util.Scanner;

public class FlowEx11 {
	public static void main(String[] args) {
		System.out.println("당신의 주민번호를 입력하세요. ex(011231-1111222) >");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char g = s.charAt(7);

		switch (g) {
		case '2':
		case '4':
			switch (g) {
			case '2':
				System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
				break;
			case '4':
				System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
			}
			break;
		case '1':
		case '3':
			switch (g) {
			case '1':
				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
				break;
			case '3':
				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
			}
			break;

		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}

	}

}
