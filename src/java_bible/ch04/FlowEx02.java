package java_bible.ch04;

import java.util.Scanner;

public class FlowEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 하나 입력하세요. >");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		} if(number==0){
			System.out.println("입력하신 숫자는 0입니다.");
		}System.out.println("입력하신 숫자는 " + number +"입니다.");

	}

}
