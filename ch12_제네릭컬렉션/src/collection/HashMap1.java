package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//Map - key,value - 하나의 쌍으로 저장한다.

public class HashMap1 {

	public static void main(String[] args) {
		
		
		//1. 생성
		HashMap<String, String> h = new HashMap<String, String>();
		
		//2. 요소추가
		h.put("apple", "스티브잡스");
		h.put("president", "대통령");
		h.put("china", "시진핑");
		h.put("terrorlist", "김정은");
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
		System.out.println("찾고싶은 영단어를 입력해줘");
		
		//키로검색한다.  키는 유일해야한다.(중복x)
		
		String key = sc.next();
		
		String value = h.get(key);  //get(key)로 검색
		System.out.println("질문하신 영단어 "+key+"는 한글로 "+value+" 입니다.");
		
		System.out.println("계속하시겠습니까(y/n)");
		String answer = sc.next();
		if(answer.equals("y")) {
			flag = true;
		} else {
			flag = false;
			System.out.println("질문이 끝났습니다, ㅅㄱ");
		}
	}
		//삭제
		int size = h.size(); //길이검색
		System.out.println("현재 해시맵의 크기: "+size);
		System.out.println();
		System.out.println();
		
		System.out.println("지우실단어를 입려갷주세요>>");
		String str = sc.next();
		//삭제
		h.remove(str);
		System.out.println();
		System.out.println();
		
		//전체읽어오기
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(value+"");
		}
		sc.close();
	}

}
