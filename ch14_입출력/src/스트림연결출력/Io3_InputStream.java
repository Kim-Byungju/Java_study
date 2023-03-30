package 스트림연결출력;

import java.io.FileInputStream;
import java.io.IOException;

public class Io3_InputStream {

	public static void main(String[] args) {
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("C:/Users/admin/Desktop/KBJ/file/file3.txt");
			byte[] bs = new byte[10];
			
			int i;
			while((i=fis.read())!=-1) {
				
				for(byte b:bs) {
					System.out.print((char)b);
				}
				System.out.println(": "+i+"바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
