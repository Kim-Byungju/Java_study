package Stringbuffer;

public class Sb1_Stringbuffer {
	public static void main(String [] args) {
		String str = new String("대한");
		StringBuffer sb1 = new StringBuffer("Hello Java");
		StringBuffer sb2 = new StringBuffer("혼자하는 자바");
		
		//1. sb1의 문자열 
		System.out.println(sb1);
		
		//2. sb1의 문자열 길이
		System.out.println(sb1.length());
		
		//3. sb1의 버퍼를 포함한 크기 
		System.out.println(sb1.capacity());
		
		//4. sb2의 문자열
		System.out.println(sb2);
		
		//5. sb2의 8번 인덱스에 "Power"문자열 추가  
		System.out.println(sb2.insert(8, "power"));
		
		//6. sb2의 8번 문자출력
		System.out.println(sb2.charAt(8));
		
		//7. sb2의 5번 인덱스를'되'로 변경s
		sb2.setCharAt(5,'되');
		System.out.println(sb2);
		
		//8. sb2의 길이를 5로 고정 시킨 후 문자열
		sb2.setLength(5);
		System.out.println(sb2);
		
		//9. sb2의 역순정렬 출력
		System.out.println(sb2.reverse());
	}
}
