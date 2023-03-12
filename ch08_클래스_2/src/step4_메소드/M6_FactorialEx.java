package step4_메소드;

class Factorial {
	
	int result = 1;
	
	void factorial(int cnt) {
		if(cnt == 1) {
			System.out.println("1 = "+result);
		}else {
			System.out.print(cnt+"*");
			result = result*cnt;
			this.factorial(--cnt); // 재귀
		}
	}
}

public class M6_FactorialEx {

	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
		f.factorial(10);
	}

}
