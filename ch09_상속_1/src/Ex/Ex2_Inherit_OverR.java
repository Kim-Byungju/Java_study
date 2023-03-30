package Ex;

class Printer {
	String mat1;
	
	public void setMaterial (String mat1) {
		this.mat1 = mat1;
	}
	public String getMaterial() {
		return "";
	}
	void print() {
		System.out.println("기본 프린터로 출력합니다.");
	}
}	
class ColorPrinter extends Printer {
	String mat2;
	int pa1;
	
	public String getMaterial () {
		return "";
	}
	public void setMaterial(String mat2) {
		this.mat2 = mat2;
	}
	void print() {
		System.out.println("컬러 프린터로 출력합니다.");
	}
	
}
class Printer3D extends Printer {
	String mat3;
	
	public String getMaterial () {
		return "";
	}
	public void setMaterial() {
	}
}

public class Ex2_Inherit_OverR {

	public static void main(String[] args) {
		

	}

}
