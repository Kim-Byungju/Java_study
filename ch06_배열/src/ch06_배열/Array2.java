package ch06_배열;

public class Array2 {

	public static void main(String[] args) {
		
		//1. 배열생성+초기화 동시
		int [] num = new int[] {1,2,3,4,5};
		System.out.println(num[0]);
		for(int i:num) {
			System.out.println("num[] = "+i);
		}
		
		//2.배열생성 및 초기화(문자열타입)
		String [] name = {"김갑수", "궁예", "정부장", "원효대사"};
		for(String str : name) {
			System.out.println("name[] = " + str);
		}
	}
	

}
