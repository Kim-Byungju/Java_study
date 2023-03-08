package Ex;

import java.util.Scanner;

public class Ex2 {
	

	public static void main(String[] args) {
		
		System.out.println("배열의 방의 크기를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		String[] strName = new String[size];
		System.out.println("이름을 저장합니다.");
		
		int i  = 0;
		String answer;
		while(i<size) {
			System.out.println(i+1+"번쩨");
			strName[i] = sc.next();
			
			System.out.println("그만하시겠습니까? (y/n)");
			answer = sc.next();
			if(answer.equals("y")) {
				break;
			}
			i++;
			if( i==(size-1)) {
				System.out.println("이제 마지막 등록입니다.");
			}
		}
		System.out.println("출력하시겠습니까? (y/n)");
		answer = sc.next();
		if(answer.equals("y")) {
			for(String name: strName) {
				System.out.println(name);
			} 
		} else if(answer.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
				
			}
		}
	}

