package generic;

class Person {
	String name = "김길동";
	void print() {
		System.out.println(name);
	}
}
class GStack3<T>{
	
	int point;
	Object[] stack;
	public GStack3() {
		point = 0;
		stack = new Object[10];
	}
	public void push(T item) {
		if(point == 10) {
			return;
		}
		stack[point] = item;
		point++;
	}
	public T pop() {
		if(point==0) {
			return null;
		}
		point--;
		return(T)stack[point];
	}
	
}
public class Generic6 {
	public static void main(String[] args) {
		
		//기본데이터타입은 박싱해서 넣는다.
		GStack3<Integer> st2 = new GStack3<Integer>();
		
		st2.push(1);
		st2.push(2);
		st2.push(3);
		for(int n = 0; n<3; n++) {
			System.out.println(st2.pop());
		}
		
		GStack3<String> st3 = new GStack3<String>();
		st3.push("서울");
		st3.push("부산");
		st3.push("개성");
		for(int n = 0; n<3; n++) {
			System.out.println(st3.pop());
	}
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		GStack3<Person> st4 = new GStack3<Person>();
		st4.push(p1);
		st4.push(p2);
		st4.push(p3);
		
		try {
			for(int n = 0; n<3; n++) {
				Person p = st4.pop();
				System.out.println(p.name);
				p.print();
			}
		} catch(NullPointerException e) {
			System.out.println("저장된 값이 없습니다.");
		}
		
	}
		

	
}


