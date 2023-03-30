package stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Token2_Ex {

	public static void main(String[] args) {
		
		System.out.println("문자를 입력해주세요");
		
		Scanner sc = new Scanner(System.in); //스캔너 준비
		//문장입력
		//nextLine()로 받기
		//만약, "그만"이라고 입력 "종료합니다..."
		while(true) {
			String str = sc.nextLine();  
			
			StringTokenizer st = new StringTokenizer(str,"");
			int n = st.countTokens();
			
			//어절의 개수는 몇개 입니다.라고 출력합니다.
			System.out.println("문장이 나누어진 개수는"+n+"입니다.");
			if(str.equals("그만")) {
				System.out.println("종료합니다");
			}
			
			//토크나이저를 이용해서 공백으로  분류하고
			
			// 그리고 나누어진 토큰을 모두 출력
			
		}

	}

}
