package java_bible.ch04;

import java.util.Scanner;

public class FlowEx32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)을 선택하세요. (종료 : 0)");
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			
			
			if(i==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(i>3) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료 : 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + i+"번 입니다.");
			}

	}

}
