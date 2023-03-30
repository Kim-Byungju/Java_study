package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {

	public static void main(String[] args) {
		
		HashSet<Student2> hs = new HashSet<Student2>();
		
		Student2 st1 = new Student2();
		st1.setName("홍길동");
		st1.setTel("010-1111-2222");
		st1.setAddress("서울 마포구 망원동");
		
		hs.add(st1);
		
		for(Student2 at : hs) {   //for-each문 활용출력
			System.out.println("이름 : "+at.getName());
			System.out.println("연락처 : "+at.getTel());
			System.out.println("주소 : "+at.getAddress());
		
		}
		System.out.println("******************");
		//출 력 방식2  - iterator 이용한 출력 
		
//		Iterator<Student2> it = hs.iterator();
//		while(it.hasNext()) {
//			Student2 st = it.next();
//			System.out.println("학생이름 : "+st.getName());
//			System.out.println("학생연락처 : "+st.getTel());
//			System.out.println("학생주소: "+st.getAddress());
//		}
		
//		Iterator<Student2> it = hs.iterator();
//		while(it.hasNext()) {
//			Student2 st = it.next();
//			System.out.println("학생이름 : "+st.getName());
//			System.out.println("학생연락처 : "+st.getTel());
//			System.out.println("학생주소: "+st.getAddress());
		
		Iterator<Student2> it = hs.iterator();
		while (it.hasNext()) {
			Student2 st = it.next();
			System.out.println("학생이름 : "+st.getName());
			System.out.println("학생 연락처 : "+st.getTel());
			System.out.println("학생 주소 : "+st.getAddress());
		}
		
	}

}
