package step6_익명클래스;

/*
	.필드 - 전역변수
	.메소드안에서 - 지역클래스
	.main()넘겨줄때 - 의존성주입

*/
class Person {
	String name = "홍길동";
	
	void wake() {
		System.out.println("일곱시에 일어남");
	}
	void eat() {
		System.out.println("점심먹음");
	}
}
class Child{
	Person field = new Person() {
		String str = "헬스";
		void work() {
			System.out.println("출근");
		}
		void hobby() {
			System.out.println(name+"님은"+str+"님과 음악취미가 같습니다."); //2.그러나 필드 내부에선 호출가능 하다.
		}
		@Override
		void wake() {
			System.out.println("6시일어남..");
		}
		@Override
		void eat() {
			System.out.println("맛있음");
			work();
			hobby();  // 3. 역시나 필드내부에서 호출가능 
		}
	}; //필드 
	
	void method1() {
		field.wake();
		field.eat();   //1.필드 외부(다른 메소드)에서는 오버라이딩된것만 호출가능
		//field.str = "깁길동";
		//field.work();
		//field.hobby();  
	}
	
	void method2() {
		Person local = new Person() {
			String str = "헬스";
			void work() {
				System.out.println("출근");
			}
			void hobby() {
				System.out.println(name+"님은"+str+"님과 음악취미가 같습니다."); 
			}
			@Override
			void wake() {
				System.out.println("6시일어남..");
			}
			@Override
			void eat() {
				System.out.println("맛있음");
				work();
				hobby();  
			}
		};                   //지역(변수)적으로 해당 메소드 안에서만 호출가능!!
		
		local.wake();
		local.eat();   
		//local.str = "깁길동";
		//local.work();
		//local.hobby();         //위 설명과 같다.!!!
		
	}
	void method3 (Person P) {
		
	}
		
	public Child() {
		
	}
}

public class Anonymous5_Class {
	public static void main(String[] args) {
		
		Child ch = new Child();
			ch.method3(new Person() {
			String str = "강호동";
			
			void study() {
				System.out.println("무엇이든잘함");
			}
			@Override
			void eat() {
				System.out.println(name+"님은"+str+"님과 저녁을 먹습니다.");  //Person 클래스 변수 사용 가능!!
			}
		});
	}
	
}
