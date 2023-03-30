package MiniProject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GoodsRegistrationController {
	String url;
	GoodsArr goodsStorage;
	Scanner scanner = new Scanner(System.in);
	
	public boolean insert() {
		
		System.out.println("제품을 등록 합니다... 제품내역을 등록 바랍니다.");
		System.out.println("제품명 : ");
		String name = scanner.next();
		System.out.println("가격 : ");
		int price = scanner.nextInt();
		
		Goods goods = new Goods(name, price);
		//GoodsArr goodsArr = new GoodsArr();
		goodsStorage = new GoodsArr();
		 goodsStorage.grr.add(goods);
		
		return true;
	}
	public void selectAll() {
		GoodsArr all = new GoodsArr();
		for(int i  = 0; i<all.grr.size(); i++) {
			Goods goods = all.grr.get(i);
			System.out.println("************");
			System.out.println("상품명  : "+goods.name);
			System.out.println("가격   : "+goods.price);
		}
	}
	public void select(String name) {
		
		GoodsArr all = new GoodsArr();
		for(int i = 0; i<all.grr.size(); i++) {
			if(name.equals(all.grr.get(i).name)) {
				System.out.println("조회하려는 상품을 찾았습니다.");
				System.out.println(all.grr.get(i).name);
				System.out.println(all.grr.get(i).price);
			}
		}
	}
	public boolean update(String name, int price) {
		
		return true;

	}
	public boolean delete(String name) {
		GoodsArr all = new GoodsArr();
		for(int i = 0; i<all.grr.size(); i++) {
			if(name.equals(all.grr.remove(i).name)) {
		System.out.println(name+"상품이 삭제되었습니다.");
			}
		}
		return true;
		
	}
}
