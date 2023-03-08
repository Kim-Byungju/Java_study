package ch06_배열;

/*
우리나라 산이름을 저장하는 배열 5개 생성
초기화 시켜서
하나씩3개 생성
전체를 일괄출력해보시오
*/


public class Array1_1 {

	public static void main(String[] args) {
		
String strArray[] = new String[5];
		
		strArray[0] = "용마산";
		strArray[1] = "백두산";
		strArray[2] = "한라산";
		strArray[3] = "에베레스트산";
		strArray[4] = "마이산";
		
		for(int i = 0; i<=strArray.length-1; i++) {
			System.out.println(strArray[i]);
		}
		for(int i=0; i<3; i++) {
			System.out.println(strArray[i]);
		}
		for(String a : strArray) {
			System.out.println(a);
		}
	}

}
