package step3_생성자;

class Score {
	String name;
	int kor, math, eng, sum;
	double avg;
	
	Score (String name, int kor, int eng, int math, int sum, double avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
	}
	void print () {
		System.out.println(name+"님");
		System.out.println("국어 : "+kor+" 영어 : "+eng+" 수학 : "+math);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}
	//학생이름, 국어점수, 수학점수, 영어점수
	// 생성자를 활용해서 필드를 초기화 시킨다.
	//print() 메소드에서
	/*
		홍길동님 
		국어 80, 영어75, 수학99
		총점 200
		평균 89.1   <합계, 평균 메소드 구현해서 다시해보기> 
	
	*/
}

public class C5_국영수합계평균출력 {

	public static void main(String[] args) {
		
		//홍길동님
		Score st1 = new Score("홍길동", 80, 75, 99, 200, 89.1);
		st1.print();
		System.out.println();
		
		//이순신님
		Score st2 = new Score("이순신", 70, 65, 98, 210, 90.1);
		st2.print();
		System.out.println();
		//강감찬님
		Score st3 = new Score("강감찬", 55, 100, 90, 220, 95.1);
		st3.print();
		System.out.println();
		
		//결과출력
	}

}
