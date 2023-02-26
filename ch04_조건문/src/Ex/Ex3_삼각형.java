package Ex;



import java.util.Scanner;



public class Ex3_삼각형 {

	//3변의 길이값을 입력받아서

	//삼각형을 그릴수 있는지 판별한다. 

	//조건: 두변의합 > 다른한변

	public static void main(String[] args) {

		
		System.out.println("세 변의 길이값을 입력하시오>>");

		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		
		if((num1+num2) < num3 || (num1+num3) < num2 || (num2+num3) < num1 ) {
			System.out.println("삼각형을 그릴수 없습니다.");

		} else {
			System.out.println("삼각형을 그릴수 있습니다.");
		}

		sc.close();

	}

}