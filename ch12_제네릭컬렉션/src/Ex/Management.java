package Ex;

import java.util.ArrayList;
import java.util.Scanner;

class Student4 {
	private int id;
	private String name, department, grade;
	Student4() {		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
class StudentManagement {
	Student4 p = new Student4();
	
	Student4 registering() {
		System.out.println("학생을 등록합니다. 입력해주세요**");
		System.out.println("ID>>");
		p.setId(Management.sc.nextInt());
		System.out.println("이름>>");
		p.setName(Management.sc.next());
		System.out.println("계열>>");
		p.setDepartment(Management.sc.next());
		System.out.println("성적(학점)");
		p.setGrade(Management.sc.next());
		
		return p;
	}
	
}


public class Management {
	static ArrayList<Student4> file = new ArrayList<Student4>();
	static Scanner sc = new Scanner(System.in);
	
	public static void insert(Student4 st) {
		file.add(st);
	}
	public static void main(String[] args) {
		
		System.out.println("학생정보를 등록해주세요");
		
		StudentManagement res = new StudentManagement();
		
		
		while(true) {
			res.registering();
			
			System.out.println("입력된 정보를 종료하고 줄력하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("y")) {
				System.out.println("입력된 정보를 출력합니다.");	
				} 
			} 
		
			
		}
			
	
public static void read(String[] answer) {
	for(int i = 0; i<file.size(); i++) {
		
		System.out.println(file.get(i).getId());
		System.out.println(file.get(i).getName());
		System.out.println(file.get(i).getDepartment());
		System.out.println(file.get(i).getGrade());
	}
}
}

