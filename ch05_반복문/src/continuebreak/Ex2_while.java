package continuebreak;

public class Ex2_while {

	public static void main(String[] args) {
		// while문 활용 1~50 3의배수 0
		//%이용해서 하고나서 0
		// 그밑에 cpntinue 이용작성
		//35이하의 수만 출력
		// % 활용
		// break 활용
		int i = 0;
		while(i<50) {
			i++;
			if(i>=35) {
				continue;
			}
			if(i%3==0) {
				System.out.println(i);
			}
		}

	}

}
