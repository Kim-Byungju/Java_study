package math;

public class Math2 {

	public static void main(String[] args) {
		
		double ran = Math.random();
		System.out.println((int)ran);
		System.out.println((int)(ran*10));
		System.out.println((int)(ran*100));
		System.out.println((int)(ran*1000));
		System.out.println((int)(ran*10000));

		
		System.out.println("******************");
		System.out.println("이번주 로또번호는 ");
		for(int i=0; i<6; i++) {
			double lotto=Math.floor((Math.random()*45+1));
			
			int lottoNo = (int)lotto;
			
			System.out.println(lotto+"");
			
		}
		//미션1
		//2~6사이 랜덤값
		//15~35사이의 랜덤값
		//1~1000
	}

}
