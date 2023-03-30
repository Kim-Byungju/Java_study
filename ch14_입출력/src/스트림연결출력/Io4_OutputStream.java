package 스트림연결출력;

import java.io.FileOutputStream;
import java.io.IOException;

public class Io4_OutputStream {

	public static void main(String[] args) {
		
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\KBJ\\file\\file5.txt");
			
			fos.write(72); 
			fos.write(65); 
			fos.write(80); 
			fos.write(80); 
			fos.write(89); 
			fos.write(32); 
			fos.write(74); 
			fos.write(65); 
			fos.write(86);
			fos.write(65);
			fos.write(33);
			
			System.out.println("정상적으로 파일이 생성되었습니다.");
			fos.close();
			
			FileOutputStream foss = new FileOutputStream("C:\\\\Users\\\\admin\\\\Desktop\\\\KBJ\\\\file\\\\file6.txt",false);
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			//배열을 저장
			foss.write(bs);
			
			//줄바꿈
			foss.write(13); //CR
			foss.write(10); //LF
			
			//일부만 저장
			foss.write(bs, 2, 10);
			
			System.out.println("정상적2");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
