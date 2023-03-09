package ch07_예외처리;

// NumberFormatException
//  - 정수가아닌 문자열을 정수로 변환할때 예외발생 처리
/*
	-문자숫자>>> 숫자 : Interger.parseInt("숫자");
	-숫자 >>> 문자숫자 : Interger.toString(숫자);
    - 실수문자숫자 >> 실수숫자 : double.parseDouble("숫자");
    - 실수숫자 >> 실수문자숫자 : double.toString(숫자);
*/
public class E2_NumberFormatException {

	public static void main(String[] args) {
		
		String[] strNumber = {"23","12","975","3.141592"};
		
		try {
			int j = Integer.parseInt(strNumber[3]);
			System.out.println("여기는 출력되나요?");
			System.out.println(j+100);
		}
		catch(NumberFormatException e) {
			System.out.println("배열에실수타입존재x");
		}
		
		System.out.println("종료합니다.");
	
				
}
}
