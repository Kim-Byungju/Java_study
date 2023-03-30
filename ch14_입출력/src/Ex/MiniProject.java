package Ex;

import java.util.ArrayList;
import java.util.Scanner;

class NotePad {
	private String name;
	private String content;
	private String number;
	
	public NotePad() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	

public static class CreatFile{
	NotePad n = new NotePad();
	NotePad n2 = new NotePad();
	
	NotePad registering() {
	
	System.out.println("메모장을 생성합니다. 입력해주세요.");	
	System.out.println("파일 넘버 >>");
	n.setNumber(MiniProject.sc.next());
	System.out.println("파일 이름 >>");
	n.setName(MiniProject.sc.next());
	System.out.println("내용 작성>>");
	n.setContent(MiniProject.sc.next());
		return n;
	}
	NotePad Saved () {
		return n2;
		
	}
}

}
public class MiniProject {
	static ArrayList<NotePad>Memo = new ArrayList<NotePad>();
	static Scanner sc = new Scanner(System.in);
	
	public static void insert(NotePad n1) {
		Memo.add(n1);
	}
	//파일 넘버로 조회하기
	public static void read(String number) {
		for(int i = 0; i<Memo.size(); i++) {
			if(number.equals(Memo.get(i).getNumber())) {
				System.out.println("파일을 찾았습니다.");
				System.out.println(Memo.get(i).getNumber());
				System.out.println(Memo.get(i).getName());
				System.out.println(Memo.get(i).getContent());
			} else {
				System.out.println("차는 파일이 존재하지 않습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("메모관리 프로그램을 시작합니다.메뉴를 선택하세요");
		
		String answer;
		while(true) {
		System.out.println("---------------------------------------------------------");
		System.out.println(" 1.목록보기 | 2.상세보기 | 3.수정하기 | 4. 삭제하기 | 5.파일저장 | 6.종료 ");
		System.out.println("---------------------------------------------------------");
		int menu = sc.nextInt();
		
			switch(menu) {
			
			case 1 :
				while(true) {
					System.out.println("파일 목록은 아래와 같습니다.");
					//목록보여주기(number)
					for(NotePad notePad:Memo) {
						System.out.println(notePad.getNumber());
					} 
					System.out.println("계속하시겠습니까?(y/n)");
					answer = sc.next();
					if(answer.equals("n")) {
						System.out.println("목록보기를 종료하겠습니다.");
						break;
					}
				}
				 break;
			case 2 :
				while(true) {
					System.out.println("상세내용은 다음과 같습니다.");
					//상세보여주기
					for(NotePad notePad:Memo) {
						System.out.println(notePad.getNumber());
						System.out.println(notePad.getName());
						System.out.println(notePad.getContent());
					} 
					System.out.println("계속하시겠습니까?(y/n)");
					answer = sc.next();
					if(answer.equals("n")) {
						System.out.println("상세보기를 종료하겠습니다.");
						break;
					}
				}
				break;
			case 3 :System.out.println("수정할건 없습니다.");break;
			case 4 :System.out.println("삭제할것도 없습니다.");break;
			
			case 5 :
				while(true) {
					System.out.println("저장할 내용을 입력 해주세요.");
					
				}
			
			case 6 :System.out.println("종료합니다.");
			
			}
		}
	}

}
