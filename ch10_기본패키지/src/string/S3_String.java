package string;

public class S3_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "java korea";
		String s2 = new String("java korea");
		String s3 = s2.intern();
		
		String s4 = "java korea";
		String s5 = "java korea";
		String s6 = "java korea";
		
		System.out.println("s1과s2가 같은장소?"+ (s1==s2));
		System.out.println("s1과s2가 같은장소?"+ (s1.equals(2)));
		System.out.println("s1과s2가 같은장소?"+ (s1==s3));
		
	}
}
