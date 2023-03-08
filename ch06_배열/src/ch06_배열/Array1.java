package ch06_배열;

public class Array1 {
	public static void main(String[] args) {
		
		//1. 배열생성
		
		int intArray[] = new int[3];
		
		System.out.println(intArray.length);
		
		//2. 값을 넣보기 - 초기화
		
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
	//3. 가져오기 -출력
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		
		//4. 전체출력
		int sum = 0;
		for(int i=0; i<=intArray.length-1; i++) {
			sum=+intArray[i];
			System.out.println("합계는 :");
			
			//5.확장 for
			for(int a : intArray) {
				System.out.println(a);
			}
		}
	}
}
// - 배열 - 같은자료형을 가지는 변수집합이 연속적으로 메모리에 저장되어 있는 형태의 자료구조
// - 생성방법 - 유형1) int[]num = newint[10] 
//			유형2)
//			유형3)
//