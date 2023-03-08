package ch06_배열;

import java.util.Scanner;

public class Array3_Ex_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] num = new int[10];
		
		int i=0;
		while(true) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			
			num[i] = sc.nextInt();
			i++;
			if(i>=num.length) {
				System.out.println("입력이 완료 되었습니다.");
				break;
			}
			
		}
		sc.close();
		
		System.out.println("*****입력하신 결과는*****");
		for(int j:num) {
			System.out.println(j);
		}
		System.out.println("*******최댓값 최솟값 합계 구하기********");
		
		int max = -10000;
		int min = 100000;
		int sum = 0;
		
		for(int j=0; j<num.length; j++) {

			//합계
			sum += num[i];
			
			//최대값
			if(max < num[i]) {
				max = num[i];
			}
			//최소
			if(min > num[i]) {
				min = num[i];
			}
			
		}
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
		System.out.println("총합 : "+sum);
	}

}
