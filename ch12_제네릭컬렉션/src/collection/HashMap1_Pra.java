package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMap1_Pra {

	public static void main(String[] args) {
		
		HashMap<String, String> hs = new HashMap<String, String>();
		
		hs.put("둘리", "아기공룡");
		hs.put("깐깐징어", "오징어");
		hs.put("짱구", "유치원생");
		hs.put("나루토", "호카게");
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("주인공의 특징을 알려줘");
			
			String key = sc.next();
			
			String value = hs.get(key);
			
			System.out.println("입력한 주의공 "+key+"의 특징은 "+value+" 입니다.");
			
			System.out.println("계속물어볼거야?(y/n)");
			String answer = sc.next();
			if(answer.equals("y")) {
				flag = true;
			} else {
				flag = false;
				System.out.println("질문이 끝났다요");
			}
		}
		Set<String> keys = hs.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = hs.get(key);
			System.out.println(value+"");
		}
		sc.close();

	}

}
