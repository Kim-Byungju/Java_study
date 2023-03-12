package step1_클래스와객체;

import java.util.Scanner;

class GuGuDan {
	//dan,su
	int dan, su;
	//생성자 - dan,su 초기화
	public GuGuDan(int dan, int su) {
		this.dan = dan;
		this.su = su;
	}
	//setNum() - dan,su, 초기화
	void setNum(int dan,int su) {
		this.dan = dan;
		this.su = su;
	}
	//gugudan() {} // 구구단 출력까지 처리 - 해당하는 단의 1~su까지만 출력
	void guguDan() {
		for(int i=1; i<=su; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
   }

public class C8_GuGuDanEx {

	public static void main(String[] args) {
		
		//스캐너로 단,수 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");	
		int dan = sc.nextInt();
		System.out.println("수를 입력해주세요");	
		int su = sc.nextInt();
		//객체 생성해서
		GuGuDan gu = new GuGuDan(dan, su);
		//초기화 시키고
		//guguDan을 출력
		gu.guguDan();

	}

}
