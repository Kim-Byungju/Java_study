package generic;

abstract class Material {
	abstract void doPrinting();
}
class Powder extends Material {	
	@Override
	void doPrinting() {
		System.out.println("재료 : Powder");
	}
}
class Plastic extends Material {
	@Override
	void doPrinting() {
		System.out.println("재료 : Plastic");
	}
}
//3D 프린터
class Printer<T> {
	
	private T material;
	
	public void setMaterial (T material) {
		this.material = material;
	}
	public T getMaterial( ) {
		System.out.println("난 파우더 프린트야");
		return material;
	}
}
public class Generic11 {
	public static void main(String[] args) {
		
//		Printer p1 = new Printer();
//		
//		Object obj1 = new Powder();
//		p1.setMaterial(obj1);
//		
//		Powder pow1 = (Powder)p1.getMaterial();
		
		Printer<Powder> printer1 = new Printer();
		Powder pow2 = new Powder();
		printer1.setMaterial(pow2);
		Powder rpo = printer1.getMaterial();
		rpo.doPrinting();
		
		System.out.println("*************************************");
		
		Printer<Plastic> printer2 = new Printer();
		Plastic pla2 = new Plastic();
		printer2.setMaterial(pla2);
		Plastic pla = printer2.getMaterial();
		pla.doPrinting();

	}
}
