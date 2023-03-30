package 활용;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class CopyTextfile {

	public static void main(String[] args) {
		
		File src = new File(""); //원본  //카피할 파일
		File dest = new File("");  //사본  //복사본
		
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c=fr.read())!= -1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"를"+dest.getPath()+"에 복사하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
