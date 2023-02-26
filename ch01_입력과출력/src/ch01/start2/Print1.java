package ch01.start2;

// 출력
/*
	ctrl + shift + / : 여러줄 주석
	
	1. 파일명은 클래스명과 일치해야한다.
	2. main() 메소드에서 실행된다.
	3. 변수는 데이터 타입을 선언후에 사용할 수 있다.
	
	4.출력(print)
		
		- System.out.ptintln()
		
		1) println() : 줄바꿈(개행) 가능
		2) print() : 줄바꿈 x
		3) printf("저의 이름은 %s이고 나이응 %d입니다.","홍길동",20) 
*/
public class Print1 {
	public static void main(String[] args) {
		
		//print
		System.out.print("Hello");
		System.out.print("java");
		
		//println
		System.out.println("Hello");
		System.out.println("java");
		
		//printf - %s 문자열, %d 정수, %f 실수
		System.out.printf("%s %s", "Hello","Java");
		System.out.printf("%s: %.4f", "몸무게",89.123456789);
	}
}
