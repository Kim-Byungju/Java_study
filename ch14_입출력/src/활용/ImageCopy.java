package 활용;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageCopy {

	public static void main(String[] args) {
		
		File src = new File("");  //이미지경로 넣어준다.
		
		File dest = new File("");
		
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			System.out.println("이미지를 복사하시겠습니까(y/n)?");
			Scanner sc = new Scanner(System.in);
			String ans = sc.next();
			if(ans.equals("y")) {
				while((c=fi.read())!=-1) {
					fo.write((byte)c);
				}
				fi.close();
				fo.close();
			}
			System.out.println("원본: "+src.getPath());
			System.out.println("사본: "+dest.getPath());
		} catch (IOException e) {
			System.out.println("파일복사오류");
		}

	}

}
