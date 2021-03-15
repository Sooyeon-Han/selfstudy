package java_bible.ch04;

import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. >");
		int num = sc.nextInt();
		
		while(num!=0) {
			sum+=num%10;
			System.out.println("sum = " + sum +" num = " + num);
			num/=10;
		}
		System.out.println();
		System.out.println("각 자리수의 합 : " + sum);
	}

}
