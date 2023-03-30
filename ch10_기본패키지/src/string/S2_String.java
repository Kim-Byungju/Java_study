package string;

public class S2_String {

	public static void main(String[] args) {
		
		char a[] = {'c','o','m','p','u','t','e','r'};
		
		String str1 = new String(a);
		String str2 = new String(a,3,2);
		
		String str3 = new String("즐거운 자바");
		String str4 = "단축 초기화 문자열";
		String str5 = str4.intern();
		
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
