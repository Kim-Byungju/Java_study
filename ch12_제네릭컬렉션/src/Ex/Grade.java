package Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		//스캐너를 활용하여 6개 학점을 입력받아 저
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요(A/B/C/D/F)");
		
		for(int i = 0; i<=4; i++) {
			String grade = sc.next();
			arr.add(grade);
		}
		System.out.println("검색할 학점을 입력하세요(A/B/C/D/F)");
		String search = sc.next();
		for (String grade: arr) {
			switch(grade) {
			case "A": System.out.println("4.0"); 
			break;
			case "B": System.out.println("3.0"); 
			break;
			case "C": System.out.println("2.0"); 
			break;
			case "D": System.out.println("1.0"); 
			break;
			case "F": System.out.println("0"); 
			break;
			default: System.out.println("잘못 입력하였습니다.");
			}
		}
	}

}
