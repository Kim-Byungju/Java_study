package collection;

import java.util.HashSet;

/*
    List를 구현한 ArrayList/Vector클래스
    	- 순서가 있고 중복을 허용한다.
 	Set을 구현한 Hashset
 	 	- 순서에  상관없이 중복을 허용하지 않는다.
 	 	- 
  
*/
public class Set1 {
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		
		h.add(new String("니밀이"));
		h.add("팜하니");
		h.add("구사망");
		h.add("이병쉰");
		h.add("팜하니");
		h.add("김정은");
		
		for(String a: h) {          //for-each문 활용출력
			System.out.println(a);
		}
		
	}

}
