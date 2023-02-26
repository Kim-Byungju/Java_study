package ch04_조건문;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력해주세요>>");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		String grade = null;
		
		if(score >=90) {
			grade = "A학점";
		} 
		else if(score >= 85) {
			grade = "A-학점";
		}
		else if(score >= 80) {
			grade = "B학점";
		}
		else if(score >= 75) {
			grade = "B-학점";
		}
		else if(score >= 70) {
			grade = "C학점";
		}

		
		System.out.println(grade);
		sc.close();
	}

}
