package ch06_배열;

import java.util.Scanner;

/* 
 	1. 더히고싶은숫자를 10개 입력
 	2. 입력받은  숫자를 배열에 저장
 	3. 총합을 구한다.
 	4. 여기의 최대값과 최소값을 구해서 출력한다.
*/

public class Array3_Ex {
	public static void main(String [] args) {
		
		System.out.println("숫자입력(10번)");
		
		int intArray[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.println((i+1)+"번째 숫자입력");
			intArray[i] = sc.nextInt();
			i++;
			if(i>intArray.length-1) {
				break;		
			}
			int sum = 0;
			int min=500000;
			
			for(int j = 0; j>intArray.length; j++) {
				sum = sum + intArray[j];
				System.out.println("총합은"+sum+"입니다");
				if(min<intArray[i]) {
					System.out.println("최솟값은"+min+"입니다");
					
				}
				
			}
			
		}
	}
}
