package generic;

abstract class Material2 {
	abstract void doPrinting();
}
class Powder2 extends Material2 {	
	@Override
	void doPrinting() {
		System.out.println("재료 : Powder");
	}
}
class Plastic2 extends Material2 {
	@Override
	void doPrinting() {
		System.out.println("재료 : Plastic");
	}
}
//3D 프린터
class Printer2<T extends Material2> { //<T> extends Powder
									  //<T extends Powder>	
	private T material;
	
	public void setMaterial (T material) {
		this.material = material;
	}
	public T getMaterial( ) {
		System.out.println("난 파우더 프린트야");
		return material;
	}
	public void Printing() {
		material.doPrinting();
	}
}

public class Generic12 {

	public static void main(String[] args) {
		//1. Powder 프린트
		Printer2 <Powder2> gPrinter = new Printer2();
		
		gPrinter.setMaterial(new Powder2());
		gPrinter.Printing();
		
		System.out.println("***********************");
		
		Printer2<Plastic2> gPrinter2 = new Printer2();
		
		gPrinter2.setMaterial(new Plastic2());
		gPrinter2.Printing();
	}

}
