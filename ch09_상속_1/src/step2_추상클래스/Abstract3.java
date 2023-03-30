package step2_추상클래스;

import java.text.DecimalFormat;

abstract class Calculator {
	
	abstract public int add(int a, int b);
	abstract public int sub(int a, int b);
	abstract public double avg(int[] a);
}

public class Abstract3 {

	public static void main(String[] args) {
		double num = 1256.567;
		DecimalFormat df = new DecimalFormat("#,###.#");
		String str = df.format(num);
		System.out.println(str);

	}

}
