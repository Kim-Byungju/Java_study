package step1_클래스와객체;

import java.util.Scanner;

class Box{
	//가로,세로,높이
	int width, height, depth;
	//가로세로깊이 필드값 setValue
	void setValue(int wtidth, int height, int depth  ) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	//부피구하기()
	int vol() {
		return width*height*depth;
	}
}
public class C5_Box {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("너비입력");
		int width = sc.nextInt();
		System.out.println("높이");
		int height = sc.nextInt();
		System.out.println("깊이");
		int depth = sc.nextInt();
		//Scanner로 입력 받아서...setValue()로 넣어서 필드값 초기화
		
		//Box1객체의 부피구하기
		Box box1 = new Box();
		box1.setValue(width, height, depth);
		System.out.println(width+"*"+height+"*"+depth+"="+box1.vol());
		
		//Box2객체의 부피구하기
		
	}
}
