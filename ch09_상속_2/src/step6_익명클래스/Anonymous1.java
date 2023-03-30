package step6_익명클래스;

interface A {
	String add(int num1, int num2);
}

public class Anonymous1 {
	
	public static void main(String[] args) {
		A a = new A() {

			@Override
			public String add(int num1, int num2) {
				return Integer.toString(num1+num2);
			}
			
		};
		System.out.println("결과값 : "+a.add(500, 400));
		
		System.out.println("***********************");
		
		A b = (int num1, int num2) -> {
				return Integer.toString(num1+num2);
		};
		String sum = b.add(500, 400);
		System.out.println("결과값 : "+sum);
		
		System.out.println("************************");

		A c = (int num1, int num2) -> Integer.toString(num1+num2);
				
			sum = b.add(500, 400);
		System.out.println("결과값 : "+sum);  //람다식
	}

}
