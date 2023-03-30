package collection;
		//1. 스캐너로 이름을 받는다.
		//2. ArrayList 또는 Vector에 저장한다.
		//3. 가장 긴이름을 찾아 출력한다.
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_실습2 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
				
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		// 1. 입력 및 저장
 		while(flag) {
			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			arr.add(name);
			
			System.out.println("어이 계속 할거냐.(y/n)");
			String answer = sc.next();
			
			if(answer.equals("y")) {
				flag = true;
			} else if(answer.equals("n")) {
				flag = false;
			}
		}
		System.out.println("입력완료시마스");
		System.out.println();
		System.out.println();
		
		//2. 데이터읽어오기
		System.out.println("입력한 이름은 아래와 같습니다.");
		for(int i =0; i<arr.size(); i++) {
			String name = arr.get(i);
			System.out.println(name+"");
		}
		System.out.println();
		System.out.println();
	
		//3. 가장 긴 이름 출력
		int longestIndex = 0;
		for(int i = 0; i<arr.size(); i++) {
			//값비교, 인데스값을 저장한다.
			if(arr.get(longestIndex).length() < arr.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("가장 긴 이름 : "+arr.get(longestIndex));
		sc.close();
	}
}
