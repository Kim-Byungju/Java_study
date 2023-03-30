package 한글입출력;

import java.io.FileReader;
import java.io.IOException;

public class Io1_FileReader {

	public static void main(String[] args) {
		
		FileReader in = null;
		try {
			in = new FileReader("C:\\\\Users\\\\admin\\\\Desktop\\\\KBJ\\\\file\\\\file7.txt");
				int c;
				while((c = in.read())!= -1) {
					System.out.println((char)c);
				}
			in.close();
		} catch (IOException e) {
			System.out.println("데이터읽어오기 실패");
		}

	}

}
