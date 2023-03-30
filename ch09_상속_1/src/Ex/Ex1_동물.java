package Ex;

class Animal {
	
	void speak() {
		System.out.println("크게 웃습니다.");
	}
}
class Dog extends Animal {
	
	void speak() {
		System.out.println("개가 짖습니다.");
	}
}
class Cat extends Animal {
	
	void speak() {
		System.out.println("고양이가 애옹거립니다.");
	}
	
}
class Chicken extends Animal {
	
	void speak() {
		System.out.println("닭이 꼬끼오거립니다.");
	}
	
}

public class Ex1_동물 {
	public static void main(String [] args) {
		
		//업캐스팅
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Chicken();
		
		a1.speak();
		a2.speak();
		a3.speak();
		
		
		
	}
}
