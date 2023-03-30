package string;

import java.util.Scanner;

public class S6_Ex {

	public static void main(String[] args) {
	
			//문자열 스캐너 입력.
		System.out.println("문자를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
			//nextLine()
		//문자열 길이 출력
		System.out.println(str.length());
		System.out.println();
		
		//받은 문자열을 한글자씩 회전
		for(int i = 0; i<str.length(); i++) {
			for(int j = 0; j<i; j--); {
				//str.substring(,str.length());	
			}
			System.out.println(str);	
		}
		sc.close();
		//LOVE FOREVER
		//  OVE FOREVERL 

	}

}
