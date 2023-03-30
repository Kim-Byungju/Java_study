package step2_추상클래스;

abstract class 동물 {
	
	abstract public void 걷기();
	abstract public void 울기();
	abstract public void 웃기();
	
	void 사냥하기() {
		System.out.println("겨울잠을 자기위해 사냥 합니다.");
	}
}
class 야생동물 extends 동물 {

	@Override
	public void 걷기() {
		System.out.println("깡총깡총 걷습니다.");
	}

	@Override
	public void 울기() {
		System.out.println("깡총깡총 웁니다.");
	}

	@Override
	public void 웃기() {
		super.사냥하기();
	}
	public String toString() {
		return "구현시켜봅시다.";
	}

}
public class Abstract1 {

	public static void main(String[] args) {
	//	동물 animal = 동물();  추상클래스는 객체생성 불가
	
		야생동물 a = new 야생동물();
		동물 b = new 야생동물(); //캐스팅은 가능
		b.걷기();
	}

}
