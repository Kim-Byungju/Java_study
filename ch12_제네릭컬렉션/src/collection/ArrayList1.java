package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private String tel;
	private String address;
	
	public String getName() {
		System.out.println("이름 : "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		System.out.println("번호: "+tel);
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		System.out.println("주소 : "+address);
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

public class ArrayList1 {
	public static void main(String[] args) {
		
		//객체생성
		ArrayList<String> arr = new ArrayList<>();
		
		//요소입력
		arr.add(new String("라면"));
		arr.add("딱보끼");
		arr.add("순대");
		arr.add("햄바그");
		
		//읽어오기
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println(arr.get(3));
		
		//크기알아보기
		System.out.println("크기 : "+arr.size());
		
		//제거
		arr.remove(0);
		System.out.println(arr.get(0));  //라면이 지워지면서 떡볶이가 올라옴 (가변형)
		
		System.out.println("**************");
		
		//중간삽입
		arr.add(1,"돈까스");
		for(int i =0; i<arr.size(); i++) { //length 아닌 size로
			System.out.println(arr.get(i));
		}
		
		
		System.out.println("===========실습==========");
		
		//실습 객체넣고 출력하기 -전체
		//반복문으로 스캔어 입력 받아서 학생을 등록하고 저장하고 출력한다.
		
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr2 = new ArrayList<>();
		
		System.out.println("등록할 학생수는?");
		
		int num = sc.nextInt();
		
		while (true) {
				
			System.out.println("학생이름을 입력해주세요");
			String name = sc.next();
			st.setName(name);
			arr2.add(name);
				
			System.out.println("학생번호를 입력해주세요");
			String tel = sc.next();
			st.setTel(tel);
			arr2.add(tel);
				
			System.out.println("학생주소를 입력해주세요");
			String address = sc.next();
			st.setAddress(address);
			arr2.add(address);		
			
			for(int j = 0; j<arr2.size(); j++) {
				System.out.println(arr2.get(j));
				}			
		}	
   }
}
