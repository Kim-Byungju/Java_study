package ch05_반복문;

public class For5 {

	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=4; k>=0; k--) {
			for (int m=0; m<=k; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
