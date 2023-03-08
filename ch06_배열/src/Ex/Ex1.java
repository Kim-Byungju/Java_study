package Ex;

import java.util.Scanner;

//스캐너로 입력받아서 배열에 저장하고 출력
//친구 5명
//1.친구이름
//2.친구나이
//3.친구몸무게

// 출력은 ""홍길동은 나이가 몇이고 몸무게가 몇입니다.

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name[] = new String[5];
		int age[] = new int[5];
		float weight[] = new float[5];
		
		int i = 0;
		while(i<5) {
			System.out.println((i+1)+"번쨰 친구의 이름을 입력하시오");
			name[i] = sc.next();
			
			System.out.println((i+1)+"번쨰 친구의 나이을 입력하시오");
			age[i] = sc.nextInt();
			
			System.out.println((i+1)+"번쨰 친구의 몸무게 입력하시오");
			weight[i] = sc.nextFloat();
			i++;
		}
		System.out.println(name[0]+"의 나이는 "+age[0]+"살 이고 몸무게는 "+weight[0]+"이다.");
		System.out.println(name[1]+"의 나이는 "+age[1]+"살 이고 몸무게는 "+weight[1]+"이다.");
		System.out.println(name[2]+"의 나이는 "+age[2]+"살 이고 몸무게는 "+weight[2]+"이다.");
		System.out.println(name[3]+"의 나이는 "+age[3]+"살 이고 몸무게는 "+weight[3]+"이다.");
		System.out.println(name[4]+"의 나이는 "+age[4]+"살 이고 몸무게는 "+weight[4]+"이다.");
	}

}
