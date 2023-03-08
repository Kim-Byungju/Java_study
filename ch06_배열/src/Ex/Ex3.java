package Ex;

import java.util.Scanner;

/*
 1) 1,2,3,4,5,6,,7,8,9,10 값을 배열에 저장하고
 2) 메뉴1번을 선택하면.. 2의배수의 합을 구하고
 3) 메뉴2번 을 선택하면  3의 배수의 합을 구하고
 3) 메뉴 3번을 선택하면.. 전체합을 구하고
 4) 메뉴 4번을 선택하면 평균을 구하는 프로그램을 작성하시오. 
*/
public class Ex3 {

	public static void main(String[] args) {
		
		int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("메뉴를 선택하시오 (1/2/3/4)");
		Scanner sc = new Scanner(System.in);
		
		String str;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		
		while(true) {
			str = sc.next();
			if (str.equals("1")) {
				System.out.println("2의 배수의 합을 구하겠습니다.");
				for (int i=0; i<num.length; i++) {
					if(num[i]%2==0) {
						sum1 += num[i];
					}
					System.out.println("2의 배수의 합은 : "+sum1);
					str = sc.next();
				} if (str.equals("2")) {
					System.out.println("3의 배수의 합을 구하겠습니다.");
					for( int j = 0; j<num.length; j++) {
						if(num[j]%3==0) {
							sum2 += num[j]; 
						}
						System.out.println("3의 배수의 합은 : "+sum2);
						} if (str.equals("3")) {
							System.out.println("전체 합계를 구하겠습니다.");
							for(int k = 0; k<num.length; k++) {
								sum3 += num[k];
							}
							System.out.println("전체 합계 :"+sum3);
						 } if (str.equals("3")); {
							 System.out.println("");
						 }					
				}
			}
		}
	}
}
