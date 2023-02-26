package ch01.start2;

import java.util.Scanner;

public class Print3 {

	public static void main(String[] args) {
		
		
		//1.이름자기소개 입력 합니다.
		//2.스캐너를 가져온다
		//3.이름을 입력받는다.
		//4.나이를 입력 받는다.
		//5.몸무게를 입력 받는다.
		//6.문장을 만들어 풀력한다.
		//7.스캐너를 닫는다
		System.out.println("이름, 나이, 몸무게를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		System.out.println("몸무게를 입력해주세요");
		Double weight = sc.nextDouble();
		
//		System.out.println("저의 이름은 "+name+" 입니다.");
//		System.out.println("저의 나이는 "+age+" 입니다.");
//		System.out.println("저의 몸무게는 "+weight+" 입니다.");
		
		System.out.printf("제이름은 %s이고 나이는 %d살이고 몸무게는 %.2f 입니다", name, age, weight);
		
		sc.close();

	}

}
