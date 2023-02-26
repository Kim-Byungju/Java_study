package ch03_연산자;

/*
	명시적형변환과 연산
		· 큰것을 작은것에 넣을때 발생 
		· 명시적으로 해주어야 한다.
		 		- 작은것 변수 = (작은것) 값;
 	연산자와 함께사용시		 		


*/
public class Op2_산술연산자 {
	public static void main(String[] args) {
		
		//정수
		byte a = 10;
		short b = 20;
		int c = 30;
		int d = 40;
		long e = 50;
		 
		//           바이트 + 쇼트
		int result1 = a + b;
		
		int result2 = b + c;
		
		int result3 = c + d;
		
		long result4 = d + e; 
		
		//실수
		float f = 10.1f;
		float g = 20.2f;
		double h = 3000.0;
		//같은 큰그릇이나 더큰그릇(여유있는)에 담아야한다
		float result5 = f + g;
		double result6 = g + h;
	}
}
