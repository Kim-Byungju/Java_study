package step1_클래스와객체;

import java.util.Scanner;

/*
   -클래스의 이름은 파일의 이름과 같아야한다.
   -생성자는 클래스의 이름과 같은 특별한 메소드이다.
   -생성자는 객체생성과 초기화의 역활을 한다.
   -클래스의 구성은
     -필드
     -생성자
      .비어있는 생성자를 기본생성자라고 부른다.
      .이 기본생성자는 코드에서 생략하면 자동으로 컴파일시 추가해준다.
    -메소드
	  .기능을 구현한다.
	  .void가 있으면 return이 없다.
	  .return이 필요하다면 메소드명 앞에 반환타입을 명시해야한다.
	  .set메소드, get메소드는 관례적으로 작명해야한다.
	-객체생성후에 활용한다.
	 - 객체명.필드명, 객체명.메소드()
	 
	 *실습 - 통장 클래스 생성  
	     - 입출금 실행
*/

//통장클래스 
class Account {
	// bank, name, balance
	String bank;
	String name;
	int balance =0;
	
	//생성자
	Account(String bank, String name, int balance) {
		this.bank = bank; //변수이름이 중복되어 this.을 붙여준것이다.
		this.name = name;
		this.balance = balance;
	}
	//메소드 생성
	
	//입금
	void deposit(int amt) {
		 balance += amt;  //balance = balance +amt;
	}
	//출금
	void withdraw(int amt) {
		if(amt > balance) {   //잔액이 0원에서 출금할 경우
			System.out.println("잔액이 부족합니다."); //이러한 메시지 춝력
		} else {
			balance -= amt;
		} 
	} 
	//잔액조회
	void balance () {
		System.out.println("현재잔액 : " +balance);
	}
}

//실행클래스
public class C6_AccountEx {

	public static void main(String[] args) {
		
		Account ac1 = new Account("신한은행", "김병주", 100000000); // ac1 객체생성(통장개설)
		
		ac1.balance(); //잔액조회
		ac1.deposit(3000); // 입금 3000
		ac1.balance(); //잔액조회
		ac1.withdraw(5000); //출금 5000
		ac1.balance(); //잔액조회
		ac1.withdraw(1000000000); //잔액부족 메시지(잔액 초과 출금)
		
		Account ac2 = new Account("국민은행", "김병주", 900000000); //통장2 개설, ac2 객체생성
		
		ac2.balance();       //잔액조회	
		ac2.deposit(500);    //입금 :500
		ac2.withdraw(3000); //출금:3000
		ac2.balance();      //잔액조회
	}

}
