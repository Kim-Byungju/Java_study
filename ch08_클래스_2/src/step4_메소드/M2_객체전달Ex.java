package step4_메소드;

class student {
	String name;
}

class Data {
	int kor;
	int eng;
	
	//객체 d1 -->t1, d2--> t2로 받아서
	Data add(Data t1, Data t2) {
		t1.kor = t2.eng;				//2.객체 넘기기
		//값을 변경하고
		System.out.println("d1.kor : "+t1.kor);
		System.out.println("d2.eng : "+t2.eng);
		
		//t1객체만 리턴한다.
		return t1;
	}
	student add(Data t1, Data t2, student st) {
		System.out.println(st.name);
		st.name = st.name+"님";
		
		return st;
	}
	
}
public class M2_객체전달Ex {

	public static void main(String[] args) {
		//1. 객체전달하려면,..
		//   -객체생성(준비)되어야한다
		Data d1 = new Data();  //1.객체를 넘기려면 객체부터 생성하세요
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.kor = 70;
		d2.eng = 80;
		
		// 2. 메소드에 매개변수로 객체를 전달한다.
		Data d4 = d3.add(d1,d2);
		System.out.println("*********************");
		System.out.println("d4.kor : "+d4.kor);
		System.out.println("d4.eng : "+d4.eng);
		
		//**********************************************************
		
		student st = new student();
		Data d5 = new  Data();
		student  k = d5.add(d1, d2, st);
		System.out.println(k.name);
		
		
	}

}
/*
필드 
	멤버변수
	정적변수(클래스변수,static변수)
	전역변수/지역변수
	변수는 초기화블록/ static블럭에의해 초기화될수있고
	생성자나, set메소드를 활용하여 초기화 할수 있다.
생성자
	기본생성자는 자동으로 생성
	return타입이 없다.(void사용x)
	객체생성시 한번만 호출된다
	객체생성과 초기화의 역할을 한다.
	오버라이딩으로 호출할수있다.
	this()를 활용 자신의 다른 생성자를 호출할 수있다.
	이때, 첫문장(제일 첫줄)에 작성되어야 한다.
메소드
	void또는 return 타입을 명시해야한다.
	오버라이딩으로 호출할수있다.
	배열, 객체의 전달에대해 이해해야한다.
	this는 내자신의 객체를 말한다.
	호출한곳으로 돌아가라는 의미로 return만 사용될수있다.

























*/