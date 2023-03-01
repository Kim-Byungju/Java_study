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
1. 클래스 : 클래스란 객체를 정의해 놓은 것
2. 객체 : 실제 존재하는 것 사물 또는 개념
3. 비유하자면 TV설계도(클래스), TV(객체)
4. 객체 = 속성(변수) +기능(메서드)
5. 인스턴스 : 특정 클래스로부터 생성된 객체 즉, 객체 = 인스턴스
6. public class가 있는 경우 소스파일의 이름은 반드시 public class의 이름과 일치하여야함
```java
public class Hello {
}
```
