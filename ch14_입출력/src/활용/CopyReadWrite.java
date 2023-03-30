package 활용;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyReadWrite {

	public static void main(String[] args) {
		File src = new File("C:\\Users\\admin\\Desktop\\KBJ\\image\\풍선1.png");
		File dest = new File("C:\\Users\\admin\\Desktop\\KBJ\\image\\풍선1.png_copy2.png");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10];
			while(true) {
				int n = fi.read(buf);
				fo.write(buf,0,n);
				if(n<buf.length) break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"→"+dest.getPath());
		} catch (IOException e) {
			System.out.println("파일 복사오류");
		}

	}

}
