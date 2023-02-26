package ch04_조건문;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		String season = "";
		
		System.out.println("월을입력해라");
		
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		
		
		switch(month) {
		case "1" :
		case "2" : season="겨울";break;
		case "3" :
		case "4" :
		case "5" : season = "봄"; break;
		}
		
		System.out.println(month+"월은 계절이"+season+"입니다.");
	}

}
