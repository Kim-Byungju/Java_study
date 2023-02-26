package ch05_반복문;

public class While1 {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
		while(i<10) {
			
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j=j+1;
			}
			System.out.println();
			i++;
			j=1;
			
//			try {
//				Thread.sleep(500);
//			}catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			i++;
		}
		System.out.println("끝났습니다");
	}

}
