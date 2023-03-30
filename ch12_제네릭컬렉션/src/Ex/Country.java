package Ex;

import java.util.HashMap;
import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		
		HashMap<String, Integer> nl = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
	while(flag)	{
		
		System.out.println("나라 이름을 입력하시오");
		String nat = sc.next();
		
		System.out.println("인구수를 입력하시오");
		int pop = sc.nextInt();
		
		nl.put(nat, pop);
		
		System.out.println("'끝'이라고 입력하면 저장하고 종료합니다. ");
		String answer  = sc.next();
		if(answer.equals("끝")) {
			flag = false;
		} 
		
	}
	System.out.println("찾고 싶은 나라를 입력해");
	String search = sc.next();
	
	int pop1 = nl.get(search); 
	
	System.out.println("검색한 "+search+"의 인구수는 "+pop1+"명 입니다.");
		
	sc.close();
	
	}

}
