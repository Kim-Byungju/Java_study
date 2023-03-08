package ch06_배열;

import java.util.Arrays;
import java.util.Scanner;

public class Array4_Ex {

	public static void main(String[] args) {
		
		// 스캐너 배열의 실수값을 10개를 저장한다.
		// 저장된 값을 오름차순으로 정렬한다.
		
		double num[] = new double[10]; 
		
		System.out.println("숫자 10개를 입력하시오");
		Scanner sc = new Scanner(System.in);

		int i=0;
		while(i<10) {
		System.out.println((i+1)+"번째 숫자를 입력하시오");
		num[i] = sc.nextDouble();	
		i++;
		}
		
		//출력확인
		//20.5
		for(double n :num) {
			System.out.println(n);
		}
		//정렬1
		
//		double temp  = 0;
//		for(int j=0; j<num.length; j++) {
//			for(int k =j+i; k<num.length; k++) {
//				if(num[j]>num[k]) {
//					temp = num[j];
//					num[k] = num[j];
//					num[j] = temp;
//				}
//			}
//		}
		
		//정렬2 = sort() 메소드활용
		Arrays.sort(num);		
		
		System.out.println("정렬된값은 :");
		for (double p : num) {
			System.out.print(p+"");
		}
		}	
	}


