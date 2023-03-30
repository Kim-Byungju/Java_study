package generic;

class GStack2{
	
	int point;
	Object[] stack;
	public GStack2() {
		point = 0;
		stack = new Object[10];
	}
	public void push(Integer item) {
		if(point == 10) {
			return;
		}
		stack[point] = item;
		point++;
	}
	public Integer pop() {
		if(point==0) {
			return null;
		}
		point--;
		return(Integer)stack[point];
	}
	
}
public class Generic5 {
	public static void main(String[] args) {
		GStack2 st2 = new GStack2();
		
		st2.push(1);
		st2.push(2);
		st2.push(3);
		for(int n = 0; n<3; n++) {
			System.out.println(st2.pop());
		}
	}
}
