package 스트림연결출력;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//c:\\windows\\system.ini 읽어서 출력해보기
// FileInputStream과 InputStreamReader 활용

public class Io2_InputStream {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		InputStreamReader in = null;
		
		try {
			fis = new FileInputStream("C:/Windows/system.ini");
			in = new InputStreamReader(fis, "utf-8");
			
			int c;
			
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			System.out.println();
			System.out.println("인코딩 문자집합 : "+in.getEncoding());
			fis.close();
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
