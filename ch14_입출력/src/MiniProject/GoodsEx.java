package MiniProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GoodsEx {

	public static void main(String[] args) throws FileNotFoundException{
		
		GoodsRegistrationController cont = new GoodsRegistrationController();
		
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		while(true) {
			System.out.println("-----------------제품관리프로그램--------------------------");		
			System.out.println(" 1.제품등록 | 2.전체조회 | 3.선택조회 | 4.가격수정 | 5.삭제 | 6.종료" );		
			System.out.println("------------------------------------------------------");	
			
			System.out.println("메뉴를 선택하세요.");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: 
				cont.insert();
					System.out.println("제품을 등록하시겠습니까(y/n)");
					String answer = sc.next();
					if(answer.equals("n")) {
						break;
					}
					try {
						fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\KBJ\\miniproject\\goodsres",false);
						oos = new ObjectOutputStream(fos);
							
						oos.writeObject(cont.goodsStorage);
					
					oos.close();
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
				//전체조회
			case 2:
				try {
					 fis  = new FileInputStream("C:\\Users\\admin\\Desktop\\KBJ\\miniproject\\goodres");
					 ois = new ObjectInputStream(fis);
					
					GoodsArr all = (GoodsArr)ois.readObject();
					
					if(all == null) {
						System.out.println("읽어올 객체가 없습니다.");
						break;
					} else {
						cont.selectAll();
					}
					ois.close();
					fis.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				//부분조회
			case 3:
				System.out.println("조회하려는 상품명을 입력 하세요.");
				String search = sc.next();
				try {
					 fis  = new FileInputStream("C:\\Users\\admin\\Desktop\\KBJ\\miniproject\\goodres");
					 ois = new ObjectInputStream(fis);
					 
					 GoodsArr all = (GoodsArr)ois.readObject();
					 if(all == null) {
							System.out.println("읽어올 객체가 없습니다.");
							break;
						} else {
							cont.select(search);
						}
				} catch (Exception e) {
					e.printStackTrace();
				}	
				System.out.println("상품조회를 계속 하시겠습까?(y/n)");
				String answer2 = sc.next();
				if(answer2.equals("n")) {
					break;
				}
				break;
			//가격수정
			case 4:
				
			//삭제
			case 5:
				System.out.println("삭제할 상품명을 입력하세요 ");
				String search2 = sc.next();
				try {
					fis  = new FileInputStream("C:\\Users\\admin\\Desktop\\KBJ\\miniproject\\goodres");
					 ois = new ObjectInputStream(fis);
					 cont.delete(search2);
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			//종료
			case 6: System.out.println("프로그램을 종료합니다.");
			}
			
		}

	}

}
