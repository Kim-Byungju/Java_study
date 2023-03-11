# Java
### record by Kim ByungJu
> 자바기반 풀스택 개발자 과정 국비지원 수업 및 책<혼자 공부하는 자바>에 기반한 자바 기록입니다. 계속해서 업데이트 해 나갈 예정입니다.
-----
### 📍Ch0 자바 개요
### 📍Ch1 자바의 입출력
### 📍Ch2 데이터 타입과 변수
### 📍Ch3 연산자
### 📍Ch4 조건문
### 📍Ch5 반복문
### 📍Ch6 배열
1. 배열이란?
   
   배열은 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스(index)를 부여해놓은 자료구조형입니다.
2. 배열선언
   
   배열을 사용하기위헤서는 우선 배열변수를 선언해야 합니다. 배열변수 선언은 다음과 같이 두가지 형식으로 작성할 수 있습니다.
   - 타입[] 변수;   
   ```java
   int[] intArray;
   ```
   - 타입 변수[];  
   ```java
   double doubleArray[];
   ```
3. 배열생성
   
   배열객체를 생성하려면 값 목록을 이용하거나 new연산자를 이용하는 방법이 있습니다.
   - 타입[] 변수 = { 값0, 값1, 값2, 값3, ...};
   ```java
   String[] names = {"원효대사", 궁예, "정부장" };
   ```
    - 타입[] 변수 = new 타입[길이];
   ```java
   int[] Array = new int[5];
   ```
4. 배열 길이
   
   배열의 길이란 배열에 저장할수 있는 전체항목의 개수를 말합니다. 
   - 배열 변수.length;
   ```java
   int[] intArray = {10, 20, 30};
   int num = intArray.length;
   ```
5. 2차원 배열
   
   배열의 값들이 행과 열로 구성된 배열을 2차원 배열이라고 합니다. 2차원 배열은 수학의 행렬과 유사합니다.  
   ```java
   int[][] scores = new int[2][3];
   ```
   ![다차원배열](https://user-images.githubusercontent.com/125637863/221576582-f94ecc29-2ed1-462c-90ea-76d4e1d60ea7.png)   
6. 향상된 for문
   
   자바는 배열이나 컬렉션을 좀더 쉽게 처리하기 위해 향상된 for문을 제공합니다. 향상된 for문은 반복실행을 하기 위해 루프 카운터 변수와 증감식을 사용하지 않습니다. 
   배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나갑니다. for문의 반복횟수는 배열의 항목 수가 됩니다. 
   - for(타입변수 : 배열) { }
   ```java
   for(int[] a:arr) {
	 for(int num: a) {
	 	System.out.print(num+"");
		}
		System.out.println();
	}
   ```   
 7. 배열 복사
   
    자바는 ~  
## 📍Ch7 예외처리
## 📍Ch8 클래스

1. 클래스의 구성 및 개념
 - 클래스 : 클래스란 객체를 정의해 놓은 것
 - 객체 : 실제 존재하는 것 사물 또는 개념, 비유하자면 TV설계도(클래스), TV(객체)
   - 객체 = 속성(변수) +기능(메서드)
 - 인스턴스 : 특정 클래스로부터 생성된 객체 즉, 객체 = 인스턴스
 - public class가 있는 경우 소스파일의 이름은 반드시 public class의 이름과 일치하여야하며, 하나의 소스파일에는 하나의 public class만 허용한다.
 - 클래스의 구성멤버에는 필드(field), 생성자(constructor), 메소드(method)가 있으며, 생략 가능하거나 여러 개수로 작성 될수 있다.
 - 객체의 생성 : 클래스명 변수명(객체명) = new 클래스명(); / 클래스명 변수명(객체명); 변수명(객체명) = new 클래스명();
 - 객체사용 : 객체명.변수(필드명); / 객체명.메소드(); 
2. 필드
 - 필드는 객체고유의 데이터, 부품객체, 상태정보를 저장하는 곳.
 - 클래스 {}블록 내부애서 선언되며, 타입 필드[=초기값]; 의 형태로 선언된다.
   - 필드 선언
   ```java
   String company = "현대자동차";
   int maxspeed = 300;
   int currentSpeed;
   ```
 - 필드를 사용한다는 것은 필드값을 읽고 변경하는 작업이다. 클래스 내부의 생성자나 메소드에서 사용할 경우 단순히 필드 이름으로 읽고 변경하면 되지만, 클래스 외부에서 사용할 경우 우선적으로 클래스로부터
   객체를 생성한뒤 필드를 사용해야 한다. 
 - 클래스 외부에서 객체를 생성한 후, 객체를 참조하게 되면 도트(.) 연산자를 사용해서 필드에 접근할수 있다.
   - 필드 사용
   ```java
   Car myCar = new Car();
   myCar.speed = 60;
   ```
3. 생성자
 - 생성자는 new연산자로 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. 객체초기화란 필드를 초기화 하거나 메소드를 호출해서 객체를 사용할 준비를 하는것을 뜻한다. 생성자를 실행하지 않고는
   클래스로부터 객체를 만들수 없다.
 - 모든 클래스는 생성자가 반드시 존재하며 생성자를 하나 이상 가질수 있다. 클래스 내부에 생성자 선언을 생략했다면 컴파일러는 {}블록이 비어있는 기본 생성자를 자동으로 추가 해준다.
 - 클래스명(매개변수선언, ...) {} 과 같은 형태로 작성하면 된다.
 - 메소드와 비슷한 모양을 가지고 있으나 리턴타입이 없고 클래스 이름과 동일하다는 특징이 있다.
 - 필드와 생성자의 매개변수 이름이 동일하면 생성자 내부에서 해당 필드에 접근할수 없는데, 동일한 이름의 매개변수 사용 우선순위가 높기 떄문이다. 해결방법은 필드앞에 'this.'를 붙이면 된다.
   this는 객체자신의 참조이며, 'this.필드'는 this라는 참조변수로 필드를 사용하는 것과 동일하다. 
 - **생성자 오버로딩**이란 매개변수를 달리하는 생성자를 여러개 선언하는 것을 말한다.
   -생성자 오버로딩 예
   ```java
   public class Car() {
   	Car() {..}
	Car(String model) {...}
	Car(String model, String color) {...}
	Car(String model, String color, int maxSpeed) {...}
   }
   ```
