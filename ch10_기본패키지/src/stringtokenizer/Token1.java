package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {

	public static void main(String[] args) {
		
		String query = "name=홍길동&address=신촌&age=21";
		
		StringTokenizer st = new StringTokenizer(query,"&");
		int n = st.countTokens();
		
		System.out.println("분리된 토큰은 몇개인가? "+n+"개");
		
//		for(int i= 0; i<n; i++) {
//			String token = st.nextToken();
//			System.out.println(token);
//		}
		System.out.println("**************");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
