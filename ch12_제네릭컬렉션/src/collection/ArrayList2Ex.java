package collection;

import java.util.ArrayList;
import java.util.Scanner;

import collection.Student2.Registration;


class Student2 {
	private String name;
	private String tel;
	private String address;
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	} //학생객체 생성클래스
	
	public static class Registration {
		Student2 p = new Student2();
		
		//등록하기 ()입력받아 학생객체반환
		
		Student2 registering() {
			
		System.out.println("학생 등록을 합니다. 입력해주세요****");
		System.out.println("이름>>");
		p.setName(ArrayList2Ex.sc.next());
		System.out.println("연락처>>");
		p.setTel(ArrayList2Ex.sc.next());
		System.out.println("주소>>");
		p.setAddress(ArrayList2Ex.sc.next());
		return p;
		}
	}
	
}

public class ArrayList2Ex {
	static ArrayList<Student2> file = new ArrayList<Student2>();  //학생저장 ArrayList
	static Scanner sc = new Scanner(System.in);
	
	public static  void insert(Student2 st) {  //배열에 넣을 add메소드 만듬
		file.add(st);
	}
	// ArrayList에서 조회하기
	public static void read(String name) {
		for(int i=0; i<file.size(); i++) {
			if(name.equals(file.get(i).getName())) {
				System.out.println("학생을 찾았습니다...");
				System.out.println(file.get(i).getName());
				System.out.println(file.get(i).getTel());
				System.out.println(file.get(i).getAddress());
			} else {
				System.out.println("찾는 학생이 존재하지 않습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		

		//실습 객체넣고 출력하기 -전체
		//반복문으로 스캔어 입력 받아서 학생을 등록하고 저장하고 출력한다.
		
	System.out.println("학생관리 프로그램을 시작합니다.");	
	
	String answer;
	while(true) {
		System.out.println("메뉴를 선책해주세요(1:학생등록, 2:학생검색, 3:종료)>>");
		int menu = sc.nextInt();
		
		switch(menu) {
			
		case 1 :
			while(true) {
				Registration res = new Registration();
				Student2 st = res.registering();
				insert(st);
				
				System.out.println("계속하시겟습냐?(y/n)");
				answer = sc.next();
				if(answer.equals("n")) {
					System.out.println("학생등록을 종료하겠습니다.");
					break;
				}
			}
			break;			
		case 2 :
			while(true) {
				System.out.println("검색할 학생이름을 입력하세요.");
				String name = sc.next();
				read(name);
				
				System.out.println("학생검색을 계속하시겠습니까?(y/n)");
				answer  = sc.next();
				if(answer.equals("n")) {
					break;
				}
			}
		}
		System.out.println("업무를 계속하시겠습니까?(y/n)");
		answer = sc.next();
		if(answer.equals("n")) {
			sc.close();
			break;
		}
	}
	System.out.println("프로그램을 종료합니다.");
   }
}
