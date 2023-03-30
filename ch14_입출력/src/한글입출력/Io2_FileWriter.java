package 한글입출력;

import java.io.FileWriter;
import java.io.IOException;


public class Io2_FileWriter {

	public static void main(String[] args) {
		
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("C:\\\\Users\\\\admin\\\\Desktop\\\\KBJ\\\\file\\\\file7.txt");
			fout.write("파일에 저장해봅니다.");
			fout.write("버퍼를 활용저장해봅니다.");
			
			char[] buf = {'A','B','C','D','E'};
			fout.write(buf);
			
			fout.close();
			
			System.out.println("데이터저장완료 읽어보시옿");
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
