package uselibrary;

import java.util.Scanner;
import mylib.ConvertDate;
import mylib.ConvertDateArr;
import mylib.DayOfCalculator;

class 근속기간 {
	
	static int[] setjoinDate(String join) {
		ConvertDate joinDate = new ConvertDateArr();
		
		return joinDate.setDate(join);
	}
	
	static int[] setResignDate(String resign) {
		ConvertDate resignDate = new ConvertDateArr();
		return resignDate.setDate(resign);
	}
	
	static String getDaysOfCalculated(int[] join, int[] resign) {
		DayOfCalculator gct = new DayOfCalculator();
		return gct.getResult(join, resign);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

}
public class 근속기간산출 {
	
}
