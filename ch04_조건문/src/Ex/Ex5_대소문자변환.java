package Ex;

import java.util.Scanner;

//입력받은 문자가 소문자 ->대문자
//입력받은 문자가 대문자->소문자
//아스키코드표 참조

public class Ex5_대소문자변환 {

	public static void main(String[] args) {
		
	System.out.println("문자를 입력해 주세요");
	Scanner sc = new Scanner(System.in);
	
	// 입력받고
	String str = sc.next();
	//쪼개서 배열에 널기 [][][]
	char [] charArr = str.toCharArray();
	//한글자만 꺼내서 저장
	char alphabet = charArr[0];
	
	int n;
	if(alphabet >= 'a' && alphabet <= 'z') {
		n= alphabet-('a'-'A');
		
	}
	else {
		n= alphabet-('A'-'a');
	}
	System.out.println((char)n);
	sc.close();
	}
}