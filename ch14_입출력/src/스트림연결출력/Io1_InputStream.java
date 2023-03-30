package 스트림연결출력;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Io1_InputStream {

	public static void main(String[] args) {
		
		//스트림은 연결할 수 있다.
		FileInputStream fis = null; //1바이트
		InputStreamReader in = null; //2바이트
		
		try {
			fis = new FileInputStream("C:/Users/admin/Desktop/KBJ/file/file2.txt");
			in = new InputStreamReader(fis,"utf-8");
			int c;
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			
			fis.close();  //try문안에서 닫아준다.
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
