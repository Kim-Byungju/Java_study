package step6_Static;

class StaticVar{
	
	String name;
	static String address; //클래스변수, 정적변수, static변수
	
	void setName(String name) {
		this.name = name;
		
	}
	//클래스 메소드(정적메소드, static메소드)
	static void print() {
		address = "마포구";
		//name = "홍길동";
		//setName("금요일");  //this못씀(자기자신에 객체를 가르키는 객체임에..)
		
		int age = 30;
		
		String tel = "010-15-4545";
	}
}

public class Static1_정적변수 {

	public static void main(String[] args) {
		
		//객체 생성전
		StaticVar.address = "영등포";
		StaticVar.print();
		//StaticVar.setName("홍길동);
		
		//객체생성후
		StaticVar sv1 = new StaticVar();
		String name = sv1.name;
		sv1.setName("홍길동");
		
		sv1.address="마포구";
		
		StaticVar sv2 = new StaticVar();
		sv2.address = "강서구";
		
		System.out.println(StaticVar.address);
		System.out.println(sv1.address);
		System.out.println(sv2.address);
		
	}

}
