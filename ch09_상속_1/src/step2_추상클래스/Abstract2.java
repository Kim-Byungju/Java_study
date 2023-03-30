package step2_추상클래스;

import java.text.DecimalFormat;

abstract class Shape {
	abstract void draw();
	abstract double computerArea(double a,double b);
}

class Circle extends Shape {

	@Override
	void draw() {	
		
	}

	@Override
	double computerArea(double a, double b) {
		return a*a*3.141592;
	}
	
}
class Rectangle extends Shape {

	@Override
	void draw() {
		
	}

	@Override
	double computerArea(double a, double b) {
		return a*b;
	}
	
}
class Triangle extends Shape {

	@Override
	void draw() {
		
	}

	@Override
	double computerArea(double a, double b) {
		return a*b/2;
	}
	
}
public class Abstract2 {

	public static void main(String[] args) {
		
		Shape s = new Circle(); {
			s.draw();
			s.computerArea(10.5, 21.4);
			
			s = new Rectangle();
			
			s= new Triangle();
			
			//**********************
			Shape[] sa = new Shape[3];
			sa[0] = new Circle();
			sa[1] = new Rectangle();
			sa[2] = new Triangle();
			
			DecimalFormat df = new DecimalFormat("#,###.#");
		
			for(Shape t :sa) {
				t.draw();
				t.computerArea(10.5, 20.4);
				String value = df.format(t.computerArea(10.5, 20.4));
				System.out.println("*****************************");
			}
				
			}
		}

	}