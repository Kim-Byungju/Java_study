package step4_메소드;

public class M5_4PersonEx {

	public static void main(String[] args) {

		M5_1Student st1 = new M5_1Student();
		st1.print();
		//st1.name();  private 접근지정자 임에 따라 해당 클래스안에서만 사용가능
		
		M5_2Teacher tc1 = new M5_2Teacher();
		tc1.print();
		
		
		//실습 - 객체배열(학생,선생님,관리자님)
	}

}
