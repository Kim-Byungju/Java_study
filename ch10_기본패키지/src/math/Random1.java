package math;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt(); //정수난수발생 - 음수,0,양수포함 , 2의31승 
		int m = r.nextInt(100); //0~99정수 난수 발생
		

	}

}
