# Java
### record by Kim ByungJu
> 자바기반 풀스택 개발자 과정 국비지원 수업 및 책<혼자 공부하는 자바>에 기반한 자바 기록입니다. 계속해서 업데이트 해 나갈 예정입니다.
-----
### 📍Ch0 자바 개요
 - 자바는 1995년도에 처음 썬 마이크로시스템즈에서 발표 후, 가장 성공한 프로그래밍 언어로서 전세계적으로 다양한 분야에서 사용되고있습니다.
 - 자바로 작성된 프로그램은 모든 운영체제 에서 실행 가능합니다. 따라서 윈도우에서 개발된 프로그램을 수정하지 않고 바로 리눅스에서 실행할수 있다는 장점이 있습니다.
 - 객체를 만들고 이객체들을 서로 연결하여 더큰 프로그램을 완성하는 기법을 객체지향 프로그래밍이라고 합니다. 자바는 객체지향프로그래밍을 위한 최적의 언어입니다. 
-----  
### 📍Ch1 자바의 입출력
1. 출력
   ```java
   System.out.println();
   ```
  - println() : 줄바꿈(개생) 기능
  - print() : 줄바꿈 블가 
  - printf() : 출력포맷이며 데이터의 종류에 따라 여러 출력행태를 가진다. ex) printf("저의 이름은 %s이고 나이는 %d입니다.", "홍길동", 20)
 2. 입력
    ```java
    Scanner sc = new scanner(System.in);
    String name = sc.next();
    int age = sc.nestInt();
    ```
  - 입력타입에 따라 사용해야하는 메소드가 달라진다.
  - next() : 문자열
  - nextLine() : 한줄씩 읽는다.
  - nextInt() : 정수
  - nextDouble() : 실수
 -----
### 📍Ch2 데이터 타입과 변수
 1.  변수
  - 변수란 데이터를 저장하기 위해 프로그램에 의해 이름을 할당 받은 메모리 공간을 의미합니다. 변수란 데이터를 저장할 수 있는 메모리 공간을 의미하며, 이렇게 저장된 값은 변경될수 있다.
  - 자바에서는 변수의 이름을 짓는데 규칙이있다.
    1. 변수의 이름은 영문자(대문자), 숫자, 언더바, 달러($)로만 구성할 수 있다.
    2. 변수의 이름은 숫자로 시작할 수 없다.
    3. 변수의 이름 사이에는 공백을 포함할 수 없다.
    4. 변수의 이름을 자바에서 미리 정의된 키워드로 사용할 수 없다.
 2. 변수의 종류
  - 자바에서 변수의 타입은 크게 두가지로 구분된다.
    1. 기본형(primmitive type)
      - 정수형 : byte, short, int, long
      - 실수형 : float, double
      - 문자형 : char
      - 논리형 : boolean
    2. 참조형(reference type)변수
  
 3. 변수의 선언
  - 변수의 선언만 하는 방법이다. 먼저, 변수를 선언하고 나중에 변수를 초기화 하는 방법이다.
    ```java
    타입 변수이름;
    ```
    ```java
    int sum;
    float num;
    ```
  - 자바에서는 변수의 선언과 동시에 값을 초기화 시킬 수 있다. 또한, 선언하고자하는 변수의 타입이 같으면 동시 선언도 가능하다.
    ```java
    타입 변수이름, 변수이름;
    타입 변수이름 = 초기화값;
    ```
    ```java
    int num1, num2;  //같은 타입의 변수를 동시 선언
    boolean falg = true; //선언과 동시에 초기화.
    ```
 4. 상수
  - 상수는 변수와 마찬가지로 이름을 가지고 있는 메모리 공간으로 ,이러한 상수는 선언과 동시에 초기화 해야 한다. final 키워드를 사용하여 선언한다.(일반적으로 상수의 변수명은 대문자를 사용)
    ```java
    final int NUM = 30;
    ```
 -----
### 📍Ch3 연산자
 1. 산술연산자
  - 산술연산자는 사칙연산을 다루는 연산자로, 가장 기본적이면서도 가장 많이 사용되는 연산자 중 하나입니다.
  - 산술연산자는 모두 두개의 피연산자를 가지는 이항연산자이며 피연산자들의 결합방향은 왼쪽에서 오른쪽입니다.
    ```java
    + : 왼쪽의 피연산자에 오른쪽의 피연산자를 더함.
    - : 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌.
    * : 완쪽의 피연산자에 오른쪽의 피연산자를 곱합.
    / : 완쪽의 피연산자를 오른쪽의 피연산자로 나눔.
    % : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 반환함.
    ```
  2. 대입 연산자
   - 대입연산자는 변수에 값을 대입할 때 사용하는 이항 연산자이며, 피연산자들의 결합방향은 오른쪽에서 왼쪽이다.
     ```java
    =  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함.
    += : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후,  그 결과값을 왼쪽의 피연산자에 대입함.
    -= : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 후,  그 결과값을 왼쪽의 피연산자에 대입함.
    *= : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후,  그 결과값을 왼쪽의 피연산자에 대입함.
    /= : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후,  그 결과값을 왼쪽의 피연산자에 대입함.
    %= : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후,  그 나머지를 왼쪽의 피연산자에 대입함.
    &= : 왼쪽의 피연산자를 오른쪽의 피연산자와 비트AND연산한 후, 그 결과값을 왼쪽의 피연산자에 대입함.
    |= : 왼쪽의 피연산자를 오른쪽의 피연산자와 비트OR연산한 후, 그 결과값을 왼쪽의 피연산자에 대입함.
    ^= : 왼쪽의 피연산자를 오른쪽의 피연산자와 비트XOR연산한 후, 그 결과값을 왼쪽의 피연산자에 대입함.
    <<= : 왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결과값을 왼쪽의 피연산자에 대입함.
    >>= : 왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결과값을 왼쪽의 피연산자에 대입함.
    >>>= : 왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결과값을 왼쪽의 피연산자에 대입함.
    ```
 -----
### 📍Ch4 조건문
-----
### 📍Ch5 반복문
-----
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
 -----
### 📍Ch7 예외처리
-----
### 📍Ch8 클래스

1. 클래스의 구성 및 개념
<img width="553" alt="스크린샷 2023-03-11 오후 4 33 34" src="https://user-images.githubusercontent.com/125637863/224471682-c17f5bd9-6f2b-44f9-89ab-04cb9ed2f8f0.png">


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
 - **생성자 오버로딩**이란 매개변수를 달리하는 생성자를 여러개 선언하는 것을 말하며, 매개변수의 타입, 개수 순서가 다르게 선언 되어야한다.
    
   - 생성자 오버로딩 예
   ```java
   public class Car() {
   	Car() {..}
	Car(String model) {...}
	Car(String model, String color) {...}
	Car(String model, String color, int maxSpeed) {...}
   }
   ```
 4. 메소드
  - 메소드 선언은 선언부와 실행 블록으로 구성된다. 메소드 선언부를 **메소드 시그니처**라고 하며 메소드 구성은 다음과 같다. 
  - **리턴타입**은 리턴값의 타입을 말하며,리턴값이란 메소드를 실행한 후의 결과값을 말한다. 메소드에서는 리턴값이 있을수도 있고 없을 수도 있으나 리턴값이 있을 경우 리턴타입이 선언부에 명시되어 있어야
    한다.
    - 메소드 리턴값
    ```java
    int plus(int x, int y) {
    int result = x + y;
    return result;
    }
    ```
  - 리턴값이 없는 메소드는 리턴타입으로 void를 사용한다. 그러나 void로 선언된 메소드에서도 return문을 사용한다. 이것은 리턴값을 저장하는 것이 안니라 메소드 실행을 강제종료 시키는 역할을 한다.
  - 메소드는 클래스 내,외부의 호출에 의해 실행되며, 클래스 내부의 다른 메소드에서 호출할 경우 단순한 메소드 이름으로 호출 가능하지만, 클래스 외부에서 호출하는 경우, 우선 클래스로부터 객체를 생성한 뒤
    참조 변수를 이용해서 메소드를 호출하여야 한다.
  - 클래스 내에 같은 이름의 메소드를 여러개 선언하는 것을 메소드 오버로딩 이라고 하며, 메소드 오버로딩의 조건은 매개변수의 타입, 개수, 순서 중 하나가 달라야 한다는 점이다.
 5. 인스턴스멤버와 정적 멤버
  - 인스턴스 멤버란 객체(인스턴스)를 생성한 후 사용할 수 있는 필드와 메소드를 말하며, 각가 인스턴스 필드, 인스턴스 메소드라고 부른다. 
  - 또한 인스턴스 필드와 인스턴스 메소드는 객체에 소속된 멤버이기 때문에 객체없이는 사용할 수 없다.
  - 정적 멤버는 클래스에 고정된 멤버로서 객체를 생성하지않고 사용할 수 있는 필드와 메소드를 말한다. 이들을 각각 정적 필드 정적 메소드라고 부른다.
    - 정적 멤버 선언
    ```java
    public class 클래스 {
     static 타입필드 [= 초기값];  //정적 필드
     
     static method (매개변수,..) { //정적 메소드
     	}
     }
    ```
  - 정적(static) 멤버를 선언해야할 판단기준은 예를 들어 카드라는 객체가 있을 떄, 카드의 가로, 세로길이는 고정된 값이니 정적멤버로 선언 되어야 하고 카드안에 들어가는 색이나 디자인은 바뀔수 있으니 
    인스턴스 멤버로 선언해햐 한다.
  - 정적 멤버를 사용하려면 클래스 이름과 함께 도트(.) 연산자로 접근을 한다. 
    ```java
    클래스.필드;
    클래스.메소드(매개값, ...);
    ```
  - 인스턴스를 단 하나만 생성하는 디자인 패턴을 싱글톤이라 한다.
  - 싱글톤을 만들려면 클래스외부에서 new연산자로 생성자를 호출할 수 없도록 private 접근 제한자를 사용하여 막아야 한다.
  - 자신의 타입인 정적필드를 선언하고 자신의 객체를 생성해 초기화 한다. 정적 필드 또한 private 접근 제한자를 붙여 외부에서 필드값을 변경하지 못하도록 한다.
  - 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고 정적필드에서 참조하고 있는 자신의 객체를 리턴한다.
    ```java
    public class 클래스 {
    
    private static 클래스 singleton = new 클래스();
    
    private 클래스() {
     }
    static 클래스 getInstance() {
      return singleton;     
     }
    }
    ```
  - final 필드는 초기값이 저장되면, 최종적인 값이 되어 프로그램 실행 도중 수정할수 없다.
  - final 필드타입 [= 초기값]; 같이 선언한다. 
  - 수학에서 사용되는 원주율(PI)같은 불변의 값을 저장하는 필드를 상수라고 한다. 상수는 static final 키워드로 선언한다.
 6. 접근 제한자 
  - public : 접근제한 x
  - protected : 같은 패키지, 자손(다른 패키지)
  - default : 같은 패키지, 소속된 클래스
  - private : 같은 클래스 내에서만 사용 가능
  ![접근제한자(Access Modifier)](https://user-images.githubusercontent.com/125637863/224527768-198307cd-0a04-4034-a307-97ab8e0423e4.png)
  
  - **Getter, Setter메소드**, 객체지향 프로그래밍에서는 일반적으로 객체의 필드를 객체외부에서 직접적으로 접근하는 것을 막는다. 그 이유는 외부에서 마음대로 변경할 경우 객체의 무결성이 깨 질수
    있기 때문이다. 이러한 문제점을 해결하기 위해 메소드를 통해 필드를 변경하는 방법을 사용한다. 
  - Getter Setter는 다음과 같이 작성할 수 있다.
 
    ![스크린샷 2023-03-12 오후 3 31 40](https://user-images.githubusercontent.com/125637863/224528698-2ecd6cf9-a5e3-463a-92c6-7351a6324eae.png)
-----
### 📍Ch9 상속
 1. 클래스 상속
  - 프로그래밍에서의 상속은 자식이 부모를 선택한다. 자식 클래스를 선언할떄 어떤 부모 클래스를 상속받을것인지 결정하고, 선택된 부모클래스는 다음과 같이 extends뒤에 기술한다.
    ```java
    class 자식클래스 extends 부모클래스 { 
    
     }
    ```
  - 자바에서 상속은 여러개의 부모 클래스를 상속 받을 수 없다. 단 하나의 부모 클래스만 상속받을 수 있다. 
  - 부모 클래스에서 private 접근제한을 갖는 필드와 메소드는 상속대상에서 제외되며, 부모 클래스와 자식 클래스가 다른 패키지에 존재한다면 default 접근제한을 갖는 필드와 메소드도 
    상속 대상에서 제외된다.
  - 메소드 재정의(overrodong)는 자식클래스에서 부모클래스의 메소드를 다시 정의하는것을 말한다. 다음은 메소드를 재정의 할떄 주의해야할 작성법이다.
    - 부모의 메소드와 동일한 시그니처(리턴타입, 메소드 이름, 매개 변수 목록)를 가져야한다.
    - 접근제한을 더 강하게 재정의할 수 없다.
    - 새로운 예외를 throws할 수 없다.
  2. 타입 변환과 다형성
   - 타입 변환이란 타입을 다른 타입으로 변환하는 행위를 말한다. 클래의 타입변환은 상속관계에 있는 클래스사이에서 발생한다. 자식은 부모 타입으로 자동 타입변환이 가능하다.
      ```java
      부모타입 변수 = 자식타입;
      ```
   - 부모 타입으로 자동변환된 이후에는 부모클래스에 선언된 필드와 메소드만 접근이 가능하다. 그러나 예외가 있는데 메소드가 자식클래스에서 재정의(override) 되었다면 자식클래스의 메소드가 대신 
     호출된다.
   - 강제 타입변환은 부모 타입을 자식 타입으로 변환하는 것을 말한다. 자식 타입이 부모 타입으로 자동타입 변환 후 다시 자식타입으로 변환할때 강제 타입 변환을 사용할 수 있다.
   - Child객체가 Parent타입으로 자동 변환된 상태에서 원래 Child로 강제변환 가능하다.   
     ```java
     Parent parent = new Child();
     Child child = (Child) parent;
     ```
   - 처음부터 부모타입으로 생성된 객체는 자식타입으로 변환할수 없다. 그렇다면 부모변수가 참조하는 객체가 부모객체인지 자식객체인지 확인을 해야한다. 
   - **instanceof** 연산자로 확인이 가능하여, 연산자의 좌항에는 객체가 오고 우항에는 타입이 온다. 좌항의 객체가 우항의 인스턴스이면, 즉 우항의 타입으로 객체가 생성 되었다면 true를 반환하고
     그렇지 않으면 false를 반환한다.
     ```java
     boolean result = 좌항(객체) instanceof 우항(타입)
     ```
  3. 추상 클래스
   - 하나 이상의 추상 메소드를 퐇마하는 클래스를 가리켜 추상클래스라고 한다. 반드시 사용되어ㅑ야 하는 메소드를 추상 메소드로 선언해 놓으면, 클래스를 상속받는 모든 클래스에서 이 추상 메소드를
     반드시 재정의 해야한다. **(추상 클래스는 추상메소드를 포함하고 있다는 점만 제외 하면 일반 클래스와 같다. 즉, 생성자와 필드 일반 메소드도 포함할 수 있다. )**
   - 추상 클래스는 다음과 같이 선언된다.  
     ```java
     abstract class 클래스명 {
     	abstract 반환타입 메소드명();
     }
     ```
   - **추상 메소드란** 자식클래스에서 반드시 오버라이딩 해애만 사용할 수 있는 메소드이다.
   - 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함 이다.
   - 추상 메소드는 선언부만 존재하며, 구현부는 작성되어 있지 않다. 작성 되어있지 않은 구현부는 자식 클래스에서 오버라이딩하여 사용한다.
   - 추상 메소드는 다음과 같이 선언한다.
      ```java
     abstract 리턴타입 메소드명 (매개변수);
     ```
-----
### 📍Ch10 인터페이스
  1. **인터페이스** 
   - 자바에서는 클래스를 통한 다중 상속을 지원하지 않습니다. 하지만 다중 상속의 이점을 버릴 수 없기에 인터페이스를 통한 다중상속을 지원하고 있다. 
   - 인터페이스란 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스사이의 중간 매개역활까지 담당하는 일종의 추상 클래스를 의미한다.
   - 인터페이스는 추상메소드와 상수만 포함이 가능하다.
  2. 인터페이스의 선언 
   - 인터페이스를 선언할 때에는 접근제어자와 함께 interface키워드를 사용하면 된다.
     ```java
     접근제어자 interface 인터페이스이름 {

     public static final 타입 상수이름 = 값;

     public abstract 메소드이름(매개변수목록);
     }
     ```
   - 인터페이스의 모든 필드는 public static final이여야 하며, 모든 메소드는 public abstract이어야 한다. 이 이부분은 생략가능하며 컴파일시 자바 컴파일러가 자동으로 추가 해준다.
  3. 인터페이스의 구현
   - 인터페이스는 추상클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수 없다. 인터페이스가 포함하고 있는 추상메소드를 구현해줄 클래스를 작성해줘야 한다.
     ```java
     class 클래스이름 implements 인터페이스 이름{};
     ``` 
  4. 인터페이스의 장점
   - 인터페이스는 다중상속이 가능하다.
   - 클래스의 작성과 인터페이스의 구현을 동시에 진행할 수 있으므로, 개발 시간을 단축할 수 있다.
   - 클래스와 클래스간의 관계를 인터페이스로 연결하면, 클래스 마다 독립적인 프로그래밍이 가능하다.
