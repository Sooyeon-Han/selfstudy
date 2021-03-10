package java_bible.ch04;

import java.util.Scanner;

public class FlowEx03 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하세요. >");
		int i = sc.nextInt();
		
		if(i!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		} else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
	}
	}

