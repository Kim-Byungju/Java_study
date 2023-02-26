package Ex;


//4x+5y = 60 되는 모든해 (x,y)를 구하시오
// x,y는 10이하다.

public class Q5_방정식 {

	public static void main(String[] args) {
		
		for(int x = 0; x<=10; x++) {
			for(int y = 0; y<=0;y++) {
				
				if(((4*x)+(5*y))==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}

	}

}
