package step1_클래스와객체;

//설계도
class Goods {
	
	//필드 - 제품명, 제품가격, 재고수, 판매수, 단가
	String 제품명;
	int 제품가격;
	int 재고수;
	int 판매수;
	int 단가;
	
	public Goods () {
		
	}
	//메소드
	//매출액계산 메소드
	double income() {
		return 판매수*제품가격;
	}
	//판매 후 재고계산 메소드
	double stock() {
		return 재고수-판매수;
	}
	//현재 재고 상태를 보는 메소드
	//제품내역 현황을 소개하는 메소드
}

//실행클래스
public class C3_GoodsEx {

	public static void main(String[] args) {
		
		Goods good = new Goods();
		//객체 생성해서... 
		// 현재고 파악
		// 제품내역 파악
		// 판매
		// 판매도
		// 매출액 파악
		// 다시 재고파악

	}

}
