package Ex;

import java.util.Scanner;

/*
1) 1,2,3,4,5,6,,7,8,9,10 값을 배열에 저장하고
2) 메뉴1번을 선택하면.. 2의배수의 합을 구하고
3) 메뉴2번 을 선택하면  3의 배수의 합을 구하고
3) 메뉴 3번을 선택하면.. 전체합을 구하고
4) 메뉴 4번을 선택하면 평균을 구하는 프로그램을 작성하시오.
5) 메뉴 5번 종료;

 
 1.배열[] = {1,2,3,4,5,6,7,8,9,10};
 2.스캐너  Scanner sc = new Scanner[]
 		int menu = sc.nextInt[]
 3.메뉴별  실행
 		while(true){
 		
 			if(menu==1) {
 				for(배열[i] %2==0) {
 					결과값은 = 결과값+배열[i]		
 				}
 				결과 출력
 			} else if() {
 		
 			} else if() {
 		
 			}
 			계속 하시겠습니까?
 			if(n) {
 			끝낸다.
 			} 
 		}
***************switch문*******************
switch() {
 case 1: 
 		for() {
 		 if() {
 		 	더해라
 		 }
 	}
 	결과값 출력
}

*/
public class Ex3_1 {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------");
		System.out.println("|1. 2의 배수의 합|2. 3의 배수의 합|3. 전체 합|4. 평균|5. 종료|");
		System.out.println("-------------------------------------------------");
		
		int menu = sc.nextInt();
		
		
		while(true) {
		int sum = 0;
		
		System.out.println("메뉴를 선택해주세요");	
		System.out.println("평균을 구하려면 3을 실행 후 4를 선택해주세요");	
		
		stop :switch(menu) {
			case 1 :
				for(int i =0; i<num.length; i++) {
					if(num[i]%2==0); {
						sum += num[i];
						
						if((i+2)<num.length) {
							System.out.print(num[i]+"+");
						} else {
							System.out.print(num[i]+"=");
						}
					}
				}
				System.out.print(sum);
				break;
			case 2: 	
				for(int i =0; i<num.length; i++) {
				if(num[i]%3==0); {
					sum += num[i];
					
					if((i+2)<num.length) {
						System.out.print(num[i]+"+");
					} else {
						System.out.print(num[i]+"=");
					}
				}
			}
			System.out.print(sum);
			break;
			case 3:
				for(int i =0; i<num.length; i++) {
						sum += num[i];
						
						if((i+2)<num.length) {
							System.out.print(num[i]+"+");
						} else {
							System.out.print(num[i]+"=");
						}
				}
				System.out.print(sum);
				break;
			case 4: 
				float avg = sum/(float)num.length;
				System.out.println("평균값: "+avg);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break stop;
			}
			System.out.println();
			System.out.println("프로그램을 종료하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("n")) {
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}