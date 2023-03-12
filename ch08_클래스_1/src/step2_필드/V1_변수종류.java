package step2_필드;

/*
   1. 전역변수
   2. 참조변수(instance변수)
   3. 지역변수
   4. 클래스변수 (static 변수, 정적변수)
   5. 매개변수  
	
*/
class Variable {
	int a;        //멤버변수(필드), 전역변수
	String b;       // 참조변수
	static int c;  // 클래스 변수, 정적변수
	
	void print(int n) { //매개변수
		int j =3;  //지역 변수
		
		System.out.println("a값은"+a+", b값은"+b+", c값은 "+c+",j 값은"+j);
		
	}
	void print2() {
		System.out.println("a :"+a+"b : "+b+ "c: "+c+ "j: 불가");
	}
}

public class V1_변수종류 {
	public static void main(String [] args) {
		
		//정적변수(클래스변수,static변수)
		/*
			 - static이 붙으면 
			 	1.객체를 생성하는것이 아니라
			     · 클래스명.변수, 클래명.메소드() 문법으로 접근한다.
			     
			    2. 객체에 종속되는것 아니며
			    3. 객체간에 공유된다.
			    4. 생성의 시점은 제일먼저 된다. 
		
		*/
		int num = Variable.c;
	}
}
