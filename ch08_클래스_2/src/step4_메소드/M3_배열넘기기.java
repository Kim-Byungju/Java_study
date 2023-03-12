package step4_메소드;


class Num {
	int sum(int[] arr) {              //value 배열의 주소값을 넣어줌
		int sum=0;
		for(int i = 0; i<arr.length; i++) {
			sum+= arr[i];
		}
		return sum;
	}
}

public class M3_배열넘기기 {

	public static void main(String[] args) {
		
		int[] value = new int[5];
		
		try {
			value[0] = 100;
			value[1] = 200;
			value[2] = 300;
			value[3] = 400;
			value[4] = 500;
			value[5] = 600;
			
		}catch (IndexOutOfBoundsException e) {
			System.out.println("범위를 초과했습니다.");
		}
		
		Num n = new Num();
		int result = n.sum(value); // 메소드에 value배열 주소값 넘기기
		
		System.out.println("결과값: "+result);
		
	}

}
