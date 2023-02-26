package ch03_연산자;

/*
	산술연산자 
		· +, -, *, 
		· /(데이터 타입과연계하여 몫만추풀할수있다)
		· %(나머지)



*/
import java.util.Scanner;

public class Op1_산술연산자 {
	
	public static void main(String[] args) {
		
		int result;
		System.out.println("숫자 두개를 입력해주세요>>");
		
		//클래스명  객체명 = 생성자
		Scanner   sc  = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		result = num1+num2;
		System.out.println("num1 + num2 = " +result);
		System.out.printf("%s + %s = %d\n", "num1","num2" ,result);
		
		String str = "결과값은 " +result+" 입니다";
		System.out.println(str);
		
		//result = num1 / num2;
		double result2 = (int)(num1 /(float)num2); // 정수 출력을하려면 int(정수형)로 바꿔주면됨 
		System.out.println("num1 / num2 = "+result);
		
		int num3 = 10;
		int num4= 3;
		double result3 = num3 % num4;
		System.out.println(result3);
		
		 
		
	}
}
