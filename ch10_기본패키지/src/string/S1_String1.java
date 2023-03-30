package string;

public class S1_String1 {

	public static void main(String[] args) {
		
		String str = "점심 맛있게드세요";
		
		// 문자열의 길이??
		System.out.println("문자열의 길이 : "+str.length());
		
		// 문자열 인덱스 2번의 문자를 출력하시오
		char c = str.charAt(2);
		System.out.println("2번문자."+c);
		
		//문자열에서 2번인덱스에서 7번인덱스 전까지 추출하여 저장후 출력하시오	
		System.out.println("2~7 출력"+str.substring(2, 8));
		
		//점심을 햄버거로 바궈보세요.
		System.out.println("바꿔서 출력 : "+str.replace("점심", "햄버거"));
		
		
		//구글링을 잘하자!
		}

}
