package step1_상속;

class Parent {
	int x = 100;
	Parent () {     //3
		this(200);		//4
		System.out.println("44이때 x의 값은 : "+x); //100
	}
	Parent(int x) {			//5
		// x=200
		System.out.println("55이때 x의 값은 : "+this.x); // 100
		this.x=x;
		System.out.println("66이때 x의 값은 : "+this.x);  //200
	}
	int getX() {
		return x;
	}
}


class child extends Parent {
	int x = 3000;
	child() { 			//2
		this(1000);
		System.out.println("11이때 x의 값은 : "+x);
	}
	child(int x) {		// 1000
		//super(x);// 추가
		System.out.println("22이때 x의 값은 : "+this.x);  //3000
		this.x = x;
		System.out.println("33이때 x의 값은 : "+this.x);  //1000
	}
	int getY() {
		return x;
	}
}

public class Inher5 {
	public static void main(String[] args) {
		child c = new child();
		System.out.println("**********************");
		System.out.println("x=" + c.getX());
		System.out.println("y=" + c.getY());
	}
}
