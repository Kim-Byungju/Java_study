package continuebreak;

public class Break3 {

	public static void main(String[] args) {
		
		int i=0, j= 0;
		target:while(i<10) {
			i+=1;
			System.out.println("현재의 i값은"+i+"입니다.");
			while(true) {
				j+=1;
				System.out.println("현재의 j값은"+j+"입니다.");
				if(j==5) {
					j=0;
					break target;
				}
			}
		}
		System.out.println("끝");
	}

}
