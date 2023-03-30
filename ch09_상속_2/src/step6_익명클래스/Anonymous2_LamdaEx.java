package step6_익명클래스;

interface A2 {
	int sum(int num1, int num2);
}

public class Anonymous2_LamdaEx {

	public static void main(String[] args) {
		A2 a1 =(int num1, int num2) -> {
				return num1+num2;
			};
	
		System.out.println(a1.sum(50, 100));
		
		System.out.println("================================");
	

	}

}
