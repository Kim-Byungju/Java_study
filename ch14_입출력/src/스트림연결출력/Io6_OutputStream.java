package 스트림연결출력;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Io6_OutputStream {

	public static void main(String[] args) {
		FileOutputStream fio;
		OutputStreamWriter out;
		
		try {
			fio = new FileOutputStream("C:\\Users\\admin\\Desktop\\KBJ\\file\\file7.txt");
			out =  new OutputStreamWriter(fio);
			out.write("가나다");
			out.write("라마바");
			
			out.close();
			fio.close();
			System.out.println("파일을 저장하였습니다,");
			
			FileInputStream fin = new FileInputStream("C:\\Users\\admin\\Desktop\\KBJ\\file\\file7.txt");
			InputStreamReader in = new InputStreamReader(fin,"utf-8");  
			
			int i;
			while((i=in.read()) !=-1) {
				System.out.println((char)i);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
