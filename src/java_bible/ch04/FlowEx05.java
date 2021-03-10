package java_bible.ch04;

import java.util.Scanner;

public class FlowEx05 {
	public static void main(String[] args) {
		int score;
		String grade;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요. >");
		score = scan.nextInt();
		
		if(score>=90) {
			grade = "A";
			if(score>=98) {
				grade = "A+";
			} else if(score<94) {
				grade = "A-";
			}
		} else if(score>=80) {
			grade = "B";
			if(score>=88) {
				grade = "B+";
			} else if(score<84) {
				grade = "B-";
			}
		} else {
			grade ="C";
		}
		System.out.println("당신의 점수는 " + score+"점 입니다.");
		System.out.println("당신의 학점은 " + grade+"입니다.");
	}
}
