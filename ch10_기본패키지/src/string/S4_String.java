package string;

public class S4_String {
	public static void main(String []atgs) {
		String s1 = "world korean";
		String s2 = "Apple";
		String s3 = "APPLE";
		
		//1.s1의 5번쨰문차출력  -
		s1.charAt(5);
		//2.s2의 s3는같은 문자인가?
		s2.equals(s3);
		//3.s2와 s3가 대소문자구별없이  출력가음
		s2.equalsIgnoreCase(s3);
		//4.s.1문자열은 왜 "world"로시작하는건가
		s1.startsWith("world");
		//5.s.1문자열은 왜 "rea"로시작하는건가;
		s1.endsWith("rea");
		//6.s2을 전체 대문자로 변환
		s2.toUpperCase();
		//7.s1의 cup무나열 시작위치(인덱스) 출력
		s1.indexOf(1);
		
		
		
		String s4="혼자하는 지바";
		
		//8. s4인덱스 5부터 8이전까지의 문자열?
		s4.substring(5, 9);
		//9. s4에 "와 프로그램" 문자열 붙어서풀력
		s4.concat("와 예제 프로그램");
		//10. s4에 자바를 "java"로 변경
		s4.replace("자바", "java");
	}
	
}
