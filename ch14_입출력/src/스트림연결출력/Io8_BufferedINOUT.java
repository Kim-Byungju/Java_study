package 스트림연결출력;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io8_BufferedINOUT {

	public static void main(String[] args) {
		//스트링생성
		System.out.println("키보드로 입력해주세요>>");
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedOutputStream out = new BufferedOutputStream(System.out,5);
		
		try {
			int c;
			while((c=in.read())!= -1) {
				out.write(c);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("데이터를 받아 출력하는데 문제가 있습니다.");
		}

	}

}
