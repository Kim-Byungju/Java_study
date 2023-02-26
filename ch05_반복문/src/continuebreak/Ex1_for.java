package continuebreak;

public class Ex1_for {

	public static void main(String[] args) {
		// for 1~50 사이에서 짝수만 출력하세요.0
		//if문 %이용해서 하고나서0
		// 그밑에 cpntinue 이용작성후출력
		
		for(int i = 1; i<=50; i++) {
			//if(i%2==0) {
			//	System.out.println(i);
			//}
			
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
			
			if(i<=27) {
				continue;
			}
			System.out.println(i);
		}

	}

}
