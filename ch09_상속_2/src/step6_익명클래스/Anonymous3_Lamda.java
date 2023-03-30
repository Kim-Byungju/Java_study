package step6_익명클래스;

interface LamdaFunction {
	void method();
}
interface Point {
	void setPoint(int x, int y);
}
interface Student {
	void setName(String name, int grade);
	public default void print() {
		System.out.println("학생입니다.");
	}
}
interface Bank {
	int balance = 500;  //상수임
	int deposit(int amount);
}
public class Anonymous3_Lamda {
	static int num1, num2;
	public static void main(String[] args) {
	Student st = new Student() {
		
		@Override
		public void setName(String name, int grade) {
			System.out.println("이름 : "+name+","+"학년 :" +grade);
			
			
		}
	};
		st.setName("홍길동", 1);
		st.print();
				
			Bank b = (amount)->{
				int balance = Bank.balance+amount;
				return balance;
			};
			
		
				

		
		
//		LamdaFunction f = new LamdaFunction() {
//			
//			@Override
//			public void method() {
//				System.out.println("함수적 인터페이스로 구현한 겁니다.");
//				
//			}
//		};
//		f.method();
//		LamdaFunction f2 = () -> {
//			System.out.println("함수적 인터페이스로 구현한 겁니다.");
//		};
//		f2.method();
//		System.out.println("*****************************");
	}

}
