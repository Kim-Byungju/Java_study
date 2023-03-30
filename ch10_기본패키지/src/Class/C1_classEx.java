package Class;

/*
	Class클래스
		- 클래스와 인터페이스의 메타데이터(클래스이름, 생성자/필드/메소드 정보)를 
		  java.lang.Class로 자바는 관리한다.
		-forName() - 클래스의 정보객체를 생성한다.
		-newInstance() - 동적으로 객체를 생성한다.
		
		-Class<?> getClass() : Object
*/
class Student {
	String name;
	int age;
	void introduce( ) {
		System.out.println(name+"님은 "+age+" 살 입니다.");
	}
}
class Person {
	String num;
	int address;
	void nameCard() {
		System.out.println(num+"이고 주소는 "+address+" 입니다");
	}
}
public class C1_classEx {

	public static void main(String[] args) {
		
		//1. 객체생성
		Student st1 = new Student();
		st1.name = "홍길동";
		st1.age = 20;
		st1.introduce();
		
		System.out.println("**************************");
		
		//2.getClass()활용
		Student st2 = new Student();
		
		Class clazz = st2.getClass(); //
		
		System.out.println(clazz.getName());  //출력결과 :  패키지.클래스명
		System.out.println(clazz.getSimpleName()); //출력결과 : 클래스명
		System.out.println(clazz.getPackageName()); //출력결과 : 패키지명
		
		try {
			Object obj = Class.forName(clazz.getName());
			Student st3 = (Student)obj;
			st3.name = "김길동";
			st3.age = 30;
			st3.introduce();
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없습니다.");
		} catch (ClassCastException e) {
			System.out.println("클래스를 형변환에 오류가 있습니다.");
		}
			
		//3.forName()
		try {
			Class clazz2 = Class.forName("Class.Student");
			Object obj = clazz2.newInstance();
			Student st4 = (Student)obj;
			st4.name = "길동이";
			st4.age = 40;
			st4.introduce();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없습니다.");
		} catch (InstantiationException e) {
			System.out.println("객체를 생성할수 없습니다..");
		} catch (IllegalAccessException e) {
			System.out.println("접근할수 없습니다.");
		}
		
		//실습
		Person p1 = new Person(); 
		try {
			Class clazz3 = Class.forName("Class.Person");
			Object obj2 = clazz3.newInstance();
			Person p2 = (Person)obj2;
			p1.num = "0101";
			p1.address = 1313;
			p1.nameCard();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없습니다.");
		} catch (InstantiationException e) {
			System.out.println("객체를 생성할수 없습니다..");
		} catch (IllegalAccessException e) {
			System.out.println("접근할수 없습니다.");
		}
		
	}

}
