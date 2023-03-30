package step1_상속;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name=name;
	}
	void introduce(String str) {
		System.out.println("저는 부모데스");
	}
}
class Student2 extends Person {
	String grade;
	public Student2(String name) {
		super(name);
	}
	@Override  //부모거를 가져다가 쓴놈이야.
	void introduce(String str) {
		System.out.println("저는 자식데스");
	}
}
public class Inher7_Upcasting {

	public static void main(String[] args) {
		
	 //업캐스팅
		Person p = new Student2("홍길동");
		
		Person p2;
		p2 = new Student2("김길동");
		
		
		Person p3;
		Student2 st = new Student2("권길동");
		p3 = st;  //st변수도 부모로 업캐스팅
		
		//부모접근  
		//System.out.println(p.grade); //자식것은안됨 
		System.out.println(p.name); //부모것은 가능 
		System.out.println(p.id); //부모것은 가능 
		
		//다운캐스팅
		Student2 st2 = (Student2)p;  
		System.out.println(st.grade); //자식
		System.out.println(st.name);  //부모
		System.out.println(st.id);   //부모
		
		//동적바인딩
		p3.introduce("기리기리길동");
		p2.introduce("");
		
	}

}
