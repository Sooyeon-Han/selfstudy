package java_bible.ch04;

import java.util.Scanner;

public class FlowEx07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");
		int p = scan.nextInt();
		int c = (int)(Math.random()*3)+1;
		
		int i = p-c;
		
		System.out.println("당신은 " + p + "입니다.");
		System.out.println("컴은 " + c + "입니다.");
		switch(i) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		}
	}

}
