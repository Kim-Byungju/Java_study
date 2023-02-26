package Ex;


//돈을 입력받아서...환산해준다.
//예) 356,789 --> 오만원권 7장, 만원권 0장, 천원권6장, 5백원

/*
1. 입력해주세요 출력
2. 스캐너객체생성
3. 입력받아서 저장한다.
4. 입력값
5. 나눠서 몫 나머지


*/
import java.util.Scanner;

public class Ex1_잔돈환산기1 {

	public static void main(String[] args) {

		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 오천원 = 5000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;	

		
		System.out.println("돈입력");
		
		//스캐너 객체생성
		Scanner sc = new Scanner(System.in);
		//입력 받아서 저장한다
		int 입금액 = sc.nextInt();
		
		String str = "";
		
		int 몫_매수 = 입금액 / 오만원;
		입금액 = 입금액 % 오만원;
		
		str += "오만원권" + 몫_매수 + "장";
		
		몫_매수 = 입금액 / 만원;
		입금액 = 입금액 % 만원;
		
		str = str + "1만원권" + 몫_매수 + "장";
		
	}
	}