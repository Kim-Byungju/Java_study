package ch03_연산자;

/*
	비트연산자
		· 비트를 사용해 사용하는 연산자
		· 정수연산만 가능하다.
		· AND : & - 1 1 --> 1
		· OR : | - 0 0 -->  0
		· XOR : ^ - 같으면0, 다르면1



*/
public class Op8_비트연산자 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 5;
		int result = n2 & n2;
		
		
		/*
		   16 8 4 2 1
      -------------------------------
      n1 10 0 1 0 1 0
      n1 10 0 0 1 0 1   >>0	
		*/
		System.out.println(result);
		
		/*
		   16 8 4 2 1
   ------------------------------- 둘중하나라도 1이면 1
   n1 10 0 1 0 1 0
   n1 10 0 0 1 0 1   >>
           1 1 1 1
		*/
		
		result = n1 | n2;
		System.out.println(result);
		
		/*
		   16 8 4 2 1
-------------------------------  다를때 1
n1 10 0 1 0 1 0
n1 10 0 0 1 0 1   >>
        1 1 1 1
		*/
		
		
		result = n1 ^ n2;
		System.out.println(result);
			
			

	}

}
