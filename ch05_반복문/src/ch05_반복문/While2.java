package ch05_반복문;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// 외부에서 숫자를 계속 입력받아서 
		// 합계와 총 몇개를 입력 받았는지.. 평균을 출력하시오
		//단, -1일 입력하면 중지하시오
		/*
		.스캐너 가져온다
		.스캐너에서 값을 반복적으로 입력 받는다.
		.받으면서 카운트, 합을 누적해 나간다.
		.그러다가 -1 입력하면 종료되고
		.입력된갯수, 합계, 평균을 출력한다.
		
		*/
		int count = 0;
		int sum = 0;
		System.out.println("계산할 숫자를 입력하고 -1을 눌러서 종료시키세요");
		
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //첫번쨰 숫자입력
		
		while(num != -1) {
				sum = sum + num; //누적
				count++;
				num = sc.nextInt();// 숫자입력 ... -1오면 종료
		}
		
		if(count == 0)
			System.out.println("입력된 숫자가 없습니다.");
		else
			System.out.println("입력된 숫자의 개수는 "+count+"개입니다.");
			System.out.println("합계 : " +sum);
			System.out.printf("평균 : %1f입니다.",((double)sum/count));
		
	

	}

}
