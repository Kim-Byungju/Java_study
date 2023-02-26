package Ex;


//1~99사이의 정수를 입력받아서
//3,6,9가 나오면 박수를 "짝" 출력한다

import java.util.Scanner;

public class Ex2_369게임 {

	public static void main(String[] args) {
		
		int res, num, numberOf369 = 0;
		
		System.out.println("1~99사이의 정수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			
			//자릿수 체크
			res = num /10;
			if(res == 3 || res == 6 || res == 9) {
				numberOf369++;
			}
				res = num % 10;
				if(res == 3 || res == 6 || res == 9) {
					numberOf369++;
				}
				//박수출력해야함 - 구현해보세요
		} 
			else {
				System.out.println("숫자가 범위를 벗어났습니다.");
		}
		sc.close();
		
	}

}
