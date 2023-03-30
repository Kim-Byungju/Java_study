package uselibrary;

//판매
//재고
//납품
class Person {
	
}
//고객관리
 interface ClientManagementInter {	
	void clientShow();
}
// 제품 
 class Goods {
	 
 }
 interface DeliveryManagementInter{
	 void setStandBQty(String name, int qty);
	 int delivertDelay(String name);
 }
 //판매관리
 interface SalesManagement {
	 void calculator(String item, int quantity);
	 long getTotalSalesAmount();
	 int getSalesQty();
 }
 //재고관리
 interface StockManagement {
	 //입고
	 void setInItem(String item, int quantity);
	 //출고
	 void setOutItem(String item, int quantity);
	 //재고관리
	 int getItemStock(String item);
 }
 
public class 제품판매재고납품관리시스템 {
	//관리자용
	static String bizLogic(int num) {
		return"";
	}
	//고객용
	static void announceService(String str) {
		
	}
	public static void main(String[] args) {
		//사용자 모드
		//관리자 모드
	}
}
