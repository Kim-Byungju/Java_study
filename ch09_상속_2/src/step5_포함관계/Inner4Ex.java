package step5_포함관계;


//부피구하기를 중첩클래스를 이용하여

class Outer2 {
	int width;
	int height;
	Inner2 inner;
	
	public Outer2(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		inner = new Inner2(depth);
	}
	public Outer2(int width, int height ) {
		this.width = width;
		this.height = height;
		
	}
	class Inner2 {
		int depth;
		Inner2() {
			
		}
		public Inner2(int depth) {
			this.depth = depth;
		}
		public int volume() {
			return width*height*depth;
		}
	}
	//내부객체반환하는 getInner()구현하시오
	Inner2 getInner(int a)  {
		return new Inner2(a);
	}
	
}


public class Inner4Ex {

	public static void main(String[] args) {
		
		//객체생성//초기화
		Outer2 ot = new Outer2(15, 10);
		
		Outer2.Inner2 in = ot.new Inner2(10);
		
		//값 출력
		System.out.println("부피값 1방법 : "+in.volume());

		//****************************************************************
		
		//메소드이용 객체생성
		Outer2 ot2 = new Outer2(10, 15);
		
		Outer2.Inner2 oi2 = ot2.getInner(50);
		System.out.println("부피값 2방법 : "+oi2.volume());
		
		//****************************************************************
		
		//생성자 
		Outer2 ot3 = new Outer2(100, 200, 300);
		System.out.println("부피값 3방법 : "+ot3.inner.volume());
		
	}

}
