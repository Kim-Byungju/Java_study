package ch03_연산자;

/*
	증감연산자
		++, -- :1씩 증가, 감소
		
		n++ <-- n=n+1
		· 전위증감연산자 : ++num
		· 후위증감연산자 : num++


*/
public class Op6_증감연산자 {

	public static void main(String[] args) {
		
//		int num;
//		num = 10;
//		
//		num = num+1;
//		System.out.println(num);
//		
//		num++;
//		System.out.println(num);
//		
//		num--;
//		System.out.println(num);
		
		//****************
//		int sum = ++num + 50;
//		System.out.println(sum);
//		
//		sum = sum++ +30;
//		System.out.println(sum);
		
		//***************
//		int n1 = 10;
//		
//		//후위증감
//		int n2 = n1++;
//		System.out.printf("n2=%d, n1%=d \n", n2, n1);
//		
//		int n3 = 10;
//		System.out.printf("n3=%d \n", n2++);
		
		//전위 증감
		int n4 = 10;
		System.out.printf("n4=%d \n", ++n4);
		System.out.printf("n4=%d \n", --n4);
		
		
		

	}

}
