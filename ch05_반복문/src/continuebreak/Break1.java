package continuebreak;

public class Break1 {

	public static void main(String[] args) {

		int num = 0, sum=0;
		
		while(true) {
			num++;
			sum = sum+num;
			if(num ==10) {
				break;
			}
			System.out.println("합계 : "+sum);
		}
		
	}

}
