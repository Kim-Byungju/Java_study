package Ex;

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int[] a);
}
class GoodCal extends Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b; 
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return (double)sum/a.length;
		
	}
	
}

public class Abstract_Ex1 {
	public static void main(String[] args) {
		
		GoodCal cal = new GoodCal();
		System.out.println(cal.add(5, 7));
		System.out.println(cal.substract(3, 4));
		
		int[] a = {2, 3, 4};
		System.out.println(cal.average(a));
	}
}
