package 스트림연결출력;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Io7_BufferreadOutput {

	public static void main(String[] args) {
		
		try {
			
			//버퍼를 이용읽기
			FileReader fin  = new FileReader("C:\\windows\\system.ini");
			BufferedReader in = new BufferedReader(fin);
			
			//출력 
			BufferedOutputStream out = new BufferedOutputStream(System.out,20);
			//읽어오기
			int c;
			while((c=in.read())!= -1) {
				out.write((char)c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
