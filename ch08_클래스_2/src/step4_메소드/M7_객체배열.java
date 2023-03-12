package step4_메소드;

//이해하기!!!!!!!!!!!!
/*
 1. 클래스를 저장할수있는 객체를 생성
 2. 클래스의 객체를 생성
 3. 배열속에 객체 저장
 4. 객체배열을 필요로 하는 메소드에 객체배열을 인수로 해서 호출한다.
 5. 메소드에서 받아서 필요한 비즈니스 로직을 처리한다.
 
 
 
*/
import java.util.Scanner;

class Items {
	String 상품명;
	int 가격;
	int 판매량;
	int 재고량;
	
	Items(String 상품명, int 가격, int 판매량, int 재고량) {
		this.상품명 = 상품명;
		this.판매량 = 판매량;
		this.재고량 = 재고량;
		this.가격 = 가격;
	}
	
	String getName() {
		return 상품명;
	}
	int getPrice() {
		return 가격;
	}
	int getSold() {
		return 판매량;
	}
	int getStock() {
		return 재고량;
	}
}
class Management {
	int totalSales(Items[]arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].판매량 * arr[i].가격;
		}
		return sum;
	}
}
public class M7_객체배열 {

	public static void main(String[] args) {
		
		Items[] items = new Items[3];
		
		System.out.println("제품현황을 등록합니다");
		Scanner sc = new Scanner(System.in); 
		
		for(int i=0; i<items.length; i++) {
			System.out.println("**************"+(i+1)+"번쨰 상품을 등록합니다.");
			
			System.out.println("상품명>");
			String name = sc.next();
			System.out.println("가격>");
			int price = sc.nextInt();
			System.out.println("판매량>");
			int salesVolume = sc.nextInt();
			System.out.println("재고량>");
			int stock = sc.nextInt();
		
			Items item = new Items(name, price, salesVolume, stock);
			items[i] = item;
		} 
		for(Items g:items) {
			System.out.println("상품명"+g.getName());
			System.out.println("가격"+g.getPrice());
			System.out.println("판매량"+g.getSold());
			System.out.println("재고량"+g.getStock());
		}
		sc.close();
		
		Management m = new Management();
		int sum = m.totalSales(items);
		System.out.println("총매출액 : "+sum+"입니다.");
	}

}
