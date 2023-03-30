package 표준입출력;

import java.io.IOException;

public class Standard2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개[enter]를 누르세요");
		
		int i;
		try {
			while((i=System.in.read())!= -1) {  //  -1 : read() 다 읽으면
				System.out.println(i+":");
				System.out.println((char)i);
				System.out.println();       //Enter 10 13으로 출력된다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
