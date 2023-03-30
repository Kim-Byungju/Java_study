package step3_인터페이스;

import bak.Shape;   //다른 패키지에서 인터페이스, class호출 (호출하려면 class,interface에서 접근지정자 public로 설정 ) / import 패키지.파일명;
import bak.Circle;
import bak.Rect;

public class ShapeEx {

	public static void main(String[] args) {

	 //Shape 배열 3개크기 생성
		
		Shape[] s1 = new Shape[3];
		s1[0] = new Circle(5);   //객체 생성하지않고 생성자에서 바로 배열에 넣기 // 매개변수 값을 넣은 이유는  기존 생성자를 생성할때 매개변수 값을 넣게 설정함
		s1[1] = new Rect(5, 4);  //객체 생성하지않고 생성자에서 바로 배열에 넣기
		
		try {
			for(Shape a: s1) {
				System.out.println("면적은"+a.getArea());     //전체면적 계산출력
				System.out.println("----------------");
				a.redraw();									// 전체 다시 그리기 출력
				System.out.println("================");
			}
			
		} catch (NullPointerException e) {
			System.out.println("값이 없는 방이 존재");
		}
	}
}
