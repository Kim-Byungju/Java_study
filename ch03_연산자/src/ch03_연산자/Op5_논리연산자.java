package ch03_연산자;

public class Op5_논리연산자 {

	public static void main(String[] args) {
		
		
		int n1 = 10;
		int n2 = 5;
		int n3 = 7;
		int n4 = 15;
		
		//&&(and) 참참참
		System.out.println(n1>n2 && n3==n4);
		System.out.println(false && false && true);
		
		//||(or) 거짓거짓거짓
		System.out.println(n1 == n2 || n3 > n4);
		System.out.println(true || false);
		
		//!
		System.out.println(!true);
		
		
		
		

	}

}
