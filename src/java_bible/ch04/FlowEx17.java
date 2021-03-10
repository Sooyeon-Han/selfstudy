package java_bible.ch04;

import java.util.Scanner;

public class FlowEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*을 출력할 라인의 수를 입력하세요. >");
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int i=1; i<=star; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
