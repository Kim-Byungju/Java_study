package continuebreak;

public class Break2 {

	public static void main(String[] args) {
		
		int i= 0, j=0;
		
		while(true) {
			while(true) {
				i += 1;
				System.out.println("현재의 i값은"+i+"입니다.");
				while(true) {
					j +=1;
					System.out.println("현재 j값은"+j+"입니다.");
					
					if(j==5) {
						break;
					}
					System.out.println("1");
					System.out.println("2");
					System.out.println("3");
				}
				j=0;
				if(i==10) {
					break;
				}
			}
			System.out.println("끝났습니다.");
		}

	}

}
