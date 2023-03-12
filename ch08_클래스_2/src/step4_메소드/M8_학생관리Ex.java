package step4_메소드;

//객체배열 전달

import java.util.Scanner;

class Student2 {
	String name;
	int age;
	String tel;
	public Student2() {
		
	}
	public Student2(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
}
class 학생관리 {
	
	//필드선언
	Student2[] st;  //st-->
	
	학생관리(int size) {   //Student s = new 학생관리(size)
	Student2[] st = new Student2[size];
		
	}
	void register(Student2[] stArr) {
		//넘어온 stArr을 st배열에 넘겨준다.(주소를 넘겨준다.)(복사)
		st=stArr; //주소 넘겨주기
//		for(int i =0; i<stArr.length; i++) {
//			
//		}  ---> 배열 복사
	}
	Student2[] getStudentArr() {  //Student2[] n = s.getStudentArr();
		return st;
	}
	
}
public class M8_학생관리Ex {

	public static void main(String[] args) {
		//스캐너를 이용해서 학생객체배열에 학생을 등록한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력해라");
		int size = sc.nextInt();
		
		Student2[] studentArr= new Student2[size];
		
		for(int i =0; i<size; i++) {
			Student2 student = new Student2();
			
			System.out.println((i+1)+"번째 학생을 등록시마스");
			System.out.println("학생이름>");
			student.name = sc.next();
			System.out.println("학생나이>");
			student.age = sc.nextInt();
			System.out.println("학생번호>");
			student.tel = sc.next();
			
			studentArr[i] = student;
			
			
			
		}
		//등록을 마쳤으면.. 학생관리 프로그램의 register() 메소드를
			//활용해서  학생관리에 st배열에 넘긴다(복사한다)
		학생관리 m = new 학생관리(size);
		m.register(studentArr);
		
		
		//학생관리 속의 get메소드를 통해서 학생관리 속의 st배열을 리턴 받아온다.
		Student2[] st = m.getStudentArr();
		//그리고 전체를 출력한다
		for(Student2 s:st) {
			System.out.println("이름 : "+s.name);
			System.out.println("나이 : "+s.age);
			System.out.println("이름 : "+s.tel);
			System.out.println("*********************");
		}

	}

}
