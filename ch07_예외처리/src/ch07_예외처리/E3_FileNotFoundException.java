package ch07_예외처리;

// FileNotFoundException : 파일을 찾을수 없을떄 예외처리


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3_FileNotFoundException {

	public static void main(String[] args) throws IOException {
		
			FileInputStream fis = new FileInputStream("./file/a.txt");
			System.out.println("파일을 찾았습니다.");
			
			int c;
			while((c=fis.read()) != -1) {
				System.out.println((char)c);
			}
		
		System.out.println();
		System.out.println("종료합니다.");
	}
}
