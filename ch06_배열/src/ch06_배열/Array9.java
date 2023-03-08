package ch06_배열;

public class Array9 {

	public static void main(String[] args) {
		
		Object[] arr = new Object[4];
		
		arr[0] = 100;
		arr[1] = "대한민국";
		arr[2] = 3.14f;
		arr[3] = 'a';
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		int num = (int)arr[0]; 			//형변환 필요(Object --> int)
		System.out.println(arr[0]);
		
		String num1 = (String)arr[1];  //형변환 필요(Object --> String)
		System.out.println(arr[1]);
		
		float num2= (float)arr[2];   //형변환 필요(Object --> double)
		System.out.println(arr[2]);
		
		char num3 = (char)arr[3]; 	   //형변환 필요(Object --> char)
		System.out.println(arr[3]);
		
	}

}
