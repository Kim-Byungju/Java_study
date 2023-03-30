package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Goods {
	String item;
	int price;
	String shop;
	public Goods(String item, int price, String shop ) {
		this.item = item;
		this.price = price;
		this.shop = shop;
	}
	public String toString() {
		return "상품명 : "+item+", 가격 : "+price+",제조사 : "+shop; 
	}
}

public class S2_Serialization {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Goods g1 = new Goods("천국행티켓", 50000, "지저스크라이스트");
		Goods g2 = new Goods("살인청부티켓", 10000, "필리핀");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\admin\\\\Desktop\\\\KBJ\\\\file\\\\serialization1.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(g1);
			oos.writeObject(g2);
			
			System.out.println("네 마음속에 저장");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//역직렬화 ***************
		
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\admin\\\\Desktop\\\\KBJ\\\\file\\\\serialization1.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Goods e1 = (Goods)ois.readObject();
			Goods e2 = (Goods)ois.readObject();
			
			System.out.println(e1.item);
			System.out.println(e1.price);
			System.out.println(e1.shop);
			System.out.println("************");
			System.out.println(e1.toString());
			System.out.println(e2.toString());
		} catch (IOException e) {
			e.printStackTrace();	
		}
		
		
	}

}
