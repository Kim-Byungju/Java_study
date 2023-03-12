package step1_클래스와객체;

import java.util.Scanner;

//기본데이터 타입 변수와 객체변수 차이점 비교

class Student {
	String name = "홍길동";
	int kor = 100;
	int eng = 88;
}

public class C10_변수연산 {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		//st1 == st2 ? --> false , 객체는 서로 다르다.
	
		
		
		if(st1==st2) {
			System.out.println("st1과 st2는 같은 객체입니다.");
		} else {
			System.out.println("st1과 st2는 다른 객체입니다.");
		}
		
		// st1의 name과 st2 name이 같은가? -->객체는 다르지만 값은 같다. true
		if(st1.name == st2.name ) {
			System.out.println("st1의 name과 st2의 name값은 같습니다.");
		} else {
			System.out.println("st1의 name과 st2의 name값은 다릅니다.");
		}
		
		
		Student st3 = st2; //객체를 대입(전달 - 주소를 준것이다.)
		
		//st1 == st3?
		//st2 == st3?
		if(st1==st3) {
			System.out.println("st1와 st3는 같은 객체입니다.");
		} else if(st2==st3) {
			System.out.println("st2와 st3는 같은 객체입니다.");
		}
		
		st1.name = "김길동";
		st2.name = "정길동";
		if(st1.name.equals("김길동")) {
			System.out.println("name의 값은 같습니다.");
		} else {
			System.out.println("name의 값은 다릅니다.");
		}
		
		if(st1.name =="김길동") {
			System.out.println("name의 값은 같습니다.");
		} else {
			System.out.println("name의 값은 다릅니다.");
		}
		
		//스케너로받아보자
		System.out.println("이름을 홍길동 두번입력하시오");
		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.next();
		String n2 = sc.next();
		
		System.out.println("******************************************************");
		
		if(n1=="홍길동") {
			System.out.println("n1 값은 같습니다.");
		} else {
			System.out.println("n1 값은 다릅니다.");
		}
		if(n1.equals("홍길동")) {
			System.out.println("n1의 이름이 홍길동과 같습니다");
			
		} else {
			System.out.println("n1의 이름이 홍길동과 다릅니다");
		}
		System.out.println("******************************************************");
		if(n1==n2) {
			System.out.println("n1과 n2는 같다");
		} else {
			System.out.println("n1과 n2는 다르다");
		}
		if(n1.equals(n2)) {
			System.out.println("n1과 n2의 값은 같다");
		} else {
			System.out.println("n1과 n2의 값은 다르다");
		}
/*
	-문자열을 다루는데 있어 알아야할 사항
	 ·문자열을 생성하는 방법은 두가지가있다.
	  1. String str  = new String("안녕");
	  2. String str = "안녕";
	  
	 ·스트링 리터럴 : 자바 내부적으로 '리터럴 테이블'로 특별히 관리되는 테이블이 JVM스트링 리터럴테이블이 존재한다.
	  	String a = "Hello"          a ---> Hello
	  	String b = "Java"           b ---> Java
	  	String c = "Hello"          c ---x (a 것을 공유)
	  
	  ·스트링객체 : new String()
	  	힙메모리에 생성된다.
	  	String d  = new String("Hello");  d---> Hello
	  	String e  = new String("Java");   e---> Java
	  	String f  = new String("Hello");  f---> Hello
		
*/
	}

}
