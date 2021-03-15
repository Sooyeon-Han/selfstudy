package java_bible.ch04;

import java.util.Scanner;

public class FlowEx28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = (int)((Math.random()*100)+1);
		int i;
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요. >");
			i = sc.nextInt();
			
			if(number>i) {
				System.out.println("더 큰 값으로 다시 시도해보세요.");
			} else if(number<i) {
				System.out.println("더 작은 값으로 다시 시도해보세요.");
			}
		} while(number!=i);
		System.out.println();
		System.out.println("정답입니다.");
		System.out.println("답 : " + number);
		
		
	}

}
