package java_bible.ch04;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int sum = 0;
		boolean b = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

		
		while(b) {
			System.out.print(">");
			number = scan.nextInt();
			
			if(number!=0) {
				sum+=number;
			} else {
				b=false;
			}
		}
		System.out.println("합계 : " + sum);
	}
}
