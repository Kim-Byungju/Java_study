package generic;

class Stack3<T> {
	
	T[] push(T[] e1) {
		for(int i=0; i<e1.length; i++) {
			e1[i] = (T)Character.valueOf((char)(i+97));
		}
		return e1;
	}
	void pop(T[] e1) {
		for(int i=0; i<e1.length; i++) {
			System.out.println("e1["+i+"]="+e1[i]);
	}
}
public static class Generic3 {
	public static void main(String[] args) {
		
		
		//1.정수타입 
//		Integer e1[] = new Integer[10];
//		Stack3<Integer> s2 = new Stack3<Integer>();
//		
//		s2.push(e1);
//		s2.pop(e1);
		
		
		Character[] e2 = new Character[10];
		Stack3<Character> s4 = new Stack3<Character>();
		
		s4.push(e2);
		s4.pop(e2);
	}

}
}