package Ex;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 문장을 입력받아 몇어절로 되어있는 문장이고 나우어진 어절(토큰)을 출력하기

*/
public class Token {

	public static void main(String[] args) {
		
		System.out.println("문장을 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		int n = st.countTokens();
		
		System.out.println("이 문장은 "+n+"어절입니다.");
		System.out.println();
		
		System.out.println("**나누어진 어절 출력**");
		while(st.hasMoreTokens()) {           // 반환값은 true/false .true: 토큰존재(어절로 나뉜단어)
			String token = st.nextToken();   //다음토큰을 불러오는 메소드
			System.out.println(token);     
		}
	}
}
